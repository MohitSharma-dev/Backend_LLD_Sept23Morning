package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

import java.util.List;

public class client {
    public static void main(String[] args) {
        //creating parking lot, floor and slot and storing in parkinglot repository
        ParkingLot parkingLot = new ParkingLot();

        ParkingFloor parkingFloor = new ParkingFloor();

        ParkingSlot parkingSlot1 = new ParkingSlot("1", ParkingSlotStatus.EMPTY, VehicleType.THREE_WHEELER, parkingFloor);
        ParkingSlot parkingSlot2 = new ParkingSlot("2", ParkingSlotStatus.EMPTY, VehicleType.TWO_WHEELER, parkingFloor);

        parkingFloor.setFloorNumber("1");
        parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPEN);
        parkingFloor.setParkingSlots(List.of(parkingSlot1, parkingSlot2));

        parkingLot.setParkingFloors(List.of(parkingFloor));
        parkingLot.setName("Parking Lot");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setSlotAssignmentStrategyType(SlotAssignmentStrategyType.RANDOM);

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.save(parkingLot);

        //creating gate and operator and storing in gate repository
        Operator operator1 = new Operator();
        Operator operator2 = new Operator();
        operator1.setOperatorName("Operator1");
        operator2.setOperatorName("Operator2");

        Gate gate1 = new Gate("1", operator1, GateType.ENTRY, GateStatus.OPEN, parkingLot);
        Gate gate2 = new Gate("2", operator2, GateType.EXIT, GateStatus.OPEN, parkingLot);

        GateRepository gateRepository = new GateRepository();
        gateRepository.save(gate1);
        gateRepository.save(gate2);
        parkingLot.setEntryGates(List.of(gate1));
        parkingLot.setExitGates(List.of(gate2));

        //creating vehicles and storing in vehicle repository
        Vehicle vehicle1 = new Vehicle("DL 1VC 0001", "Raj", VehicleType.TWO_WHEELER);
        Vehicle vehicle2 = new Vehicle("DL 1VC 00012", "Mohit sharma", VehicleType.THREE_WHEELER);

        VehicleRepository vehicleRepository = new VehicleRepository();
        vehicleRepository.save(vehicle1);
        vehicleRepository.save(vehicle2);

        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(
                                            gateRepository,
                                            vehicleRepository,
                                            ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO request = new IssueTicketRequestDTO();
        request.setGateId(gate1.getId());
        request.setVehicleNumber(vehicle1.getLicensePlate());
        request.setVehicleType(vehicle1.getVehicleType());
        request.setOwnerName(vehicle1.getOwnerName());

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