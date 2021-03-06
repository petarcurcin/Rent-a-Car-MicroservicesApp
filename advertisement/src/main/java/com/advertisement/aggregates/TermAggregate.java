package com.advertisement.aggregates;

import com.advertisement.service.TermService;
import com.core.commands.CreateTermCommand;
import com.core.events.TermCreatedEvent;
import com.core.events.TermCreatedFailedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class TermAggregate {
    @AggregateIdentifier
    private String termAggregateId;

    public TermAggregate() {
    }

    @CommandHandler
    public TermAggregate(CreateTermCommand createTermCommand, TermService termService) {
        try {
            System.out.println("Try create new termin" + createTermCommand.getAdvertisementId() + createTermCommand.getStartDate() + createTermCommand.getEndDate());
            termService.create(createTermCommand.getAdvertisementId(), createTermCommand.getStartDate(), createTermCommand.getEndDate());
            AggregateLifecycle.apply(new TermCreatedEvent(createTermCommand.getTermAggregateId()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            AggregateLifecycle.apply(new TermCreatedFailedEvent(createTermCommand.getRentAggregateId(), createTermCommand.getTermAggregateId(), "FAILED", createTermCommand.getAdvertisementId()));
        }
    }

    @EventSourcingHandler
    protected void on(TermCreatedEvent termCreatedEvent) {
        System.out.println("Term event created: " + termCreatedEvent.getTermAggregateId());
        this.termAggregateId = termCreatedEvent.getTermAggregateId();
    }

    @EventSourcingHandler
    protected void on(TermCreatedFailedEvent termCreatedFailedEvent) {
        System.out.println("Term event failed: " + termCreatedFailedEvent.getTermAggregateId());
        this.termAggregateId = termCreatedFailedEvent.getTermAggregateId();
    }

}
