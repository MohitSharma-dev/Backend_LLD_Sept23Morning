package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        // basic validations if any can be done here

        // request obj can have a lot of other details, so internally we don't send the request DTO everywhere
        try {
            Ticket ticket = ticketService.issueTicket(
                    request.getGateId(),
                    request.getVehicleNumber(),
                    request.getOwnerName(),
                    request.getVehicleType()
            );
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setTicket(ticket);
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }


        return response;
    }
}

// using the model directly with the client is not suggested

// DTO : Data transfer Object
