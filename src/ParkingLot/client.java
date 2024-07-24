package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

public class client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(
                                            gateRepository,
                                            vehicleRepository,
                                            ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO request = new IssueTicketRequestDTO();
        request.setGateId(1);
        request.setVehicleNumber("DL 1VC 0001");
        request.setVehicleType(VehicleType.THREE_WHEELER);
        request.setOwnerName("Mohit sharma");

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(request);
        if(responseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println("Ticket successfully generated!");
            System.out.println(responseDTO.getTicket().getParkingSlot().getSlotNumber());
        } else {
            System.out.println("Ticket is not generated due to " + responseDTO.getFailureMessage());
        }
    }
}

// creation of ticket : CRUD : ticket
// adding a new Floor : FloorController

// TicketController : TicketService : Repository
// topological sort


// 1. Complete your code so that it runs properly and create a pull request on my github
// 2. Implement the generate Bill functionality and raise PR