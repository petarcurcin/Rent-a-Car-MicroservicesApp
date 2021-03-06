package com.rent.soap;

import com.rent.dto.RentRequestDTO;
import com.rent.service.RentRequestService;
import com.rent.soap.code.GetRentRequestRequest;
import com.rent.soap.code.GetRentRequestResponse;
import com.rent.soap.code.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class RentEndPoint {

    private static final String NAMESPACE_URI = "http://localhost:8095/microservices/rent";

    @Autowired
    private RentRequestService rentRequestService;



    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getRentRequestRequest")
    @ResponsePayload
    public GetRentRequestResponse getRentRequests(@RequestPayload GetRentRequestRequest request) {
        System.out.println("Soap request");

        List<RentRequestDTO> rentRequests = rentRequestService.getRentRequestReserved(request.getRentRequestId()); //userId ne RentRequest

        GetRentRequestResponse response = new GetRentRequestResponse();

        for(RentRequestDTO rrDTO : rentRequests)
        {
            RentRequest rr = new RentRequest();
            rr.setAdvertisementId(rrDTO.getAdvertisementId());
            rr.setEndDateString(rrDTO.getEndDateString());
            rr.setEndDateTime(rrDTO.getEndDateTime().toString());
            rr.setNumberOfUnseen(rrDTO.getNumberOfUnseen());
            rr.setId(rrDTO.getId());
            rr.setRentRequestStatus(rrDTO.getRentRequestStatus());
            rr.setSenderId(rrDTO.getSenderId());
            rr.setStartDateString(rrDTO.getStartDateString());
            rr.setStartDateTime(rrDTO.getStartDateTime().toString());
            response.getRentRequest().add(rr);
        }


        System.out.println("zavrsio request");
        return response;

    }
}
