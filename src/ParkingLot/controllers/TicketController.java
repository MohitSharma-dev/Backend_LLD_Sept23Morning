package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();

        Ticket ticket = ticketService.issueTicket(request.getGateId() , request.getVehicleNumber());
        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTicketId(ticket.getId());

        return response;
    }
}

// using the model directly with the client is not suggested

// DTO : Data transfer Object
