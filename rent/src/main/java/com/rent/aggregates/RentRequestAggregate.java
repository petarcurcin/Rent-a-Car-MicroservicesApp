package com.rent.aggregates;

import com.core.commands.ReserveCommand;
import com.core.commands.RollbackReserveCommand;
import com.core.events.ReserveRollbackEvent;
import com.core.events.ReservedEvent;
import com.rent.enumerations.RentRequestStatus;
import com.rent.service.RentRequestService;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class RentRequestAggregate {

    @AggregateIdentifier
    private String rentAggregateId;

    public RentRequestAggregate() {
    }

    @CommandHandler
    public RentRequestAggregate(ReserveCommand reserveCommand) {
        System.out.println("RentRequestAggregate reserve command" + reserveCommand.getRentRequestId()
                + reserveCommand.getStartDate() + reserveCommand.getEndDate());

        AggregateLifecycle.apply(new ReservedEvent(reserveCommand.getRentAggregateId(), reserveCommand.getRentRequestId(),
                "RESERVED", reserveCommand.getStartDate(), reserveCommand.getEndDate(), reserveCommand.getAdvertisementId()));
    }

    @EventSourcingHandler
    public void on(ReservedEvent reservedEvent) {
        System.out.println("RentRequestAggregate reserved event on" + reservedEvent.getRentRequestId());

        this.rentAggregateId = reservedEvent.getRentAggregateId();
    }

    @CommandHandler
    public void on(RollbackReserveCommand rollbackReserveCommand, RentRequestService requestService) {
        System.out.println("RentRequestAggregate rollback command event on" + rollbackReserveCommand);
        requestService.changeStatus(rollbackReserveCommand.getRentRequestId(), RentRequestStatus.PENDING.toString());
        AggregateLifecycle.apply(new ReserveRollbackEvent(rollbackReserveCommand.getRentAggregateId(), rollbackReserveCommand.getRentRequestId()));
    }

}
