package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            TicketRepository ticketRepository
    ){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
            int gateId,
            String vehicleNumber,
            String ownerName,
            VehicleType vehicleType
    ){
        // to create ticket obj what data exactly is required

        // 1. properly create the ticket object with required details
        Ticket ticket = new Ticket();

        ticket.setEntryTime(new Date());

        // not set the gate
        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        // gate might come as null
        if(gateOptional.isEmpty()){
            throw new IllegalArgumentException("Gate not found");
        }
        Gate gate = gateOptional.get();
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setLicensePlate(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            vehicle = vehicleRepository.save(vehicle);
        } else {
            vehicle = vehicleOptional.get();
        }
        ticket.setVehicle(vehicle);
        // 2. Assign Slot

        ParkingLot parkingLot = gate.getParkingLot();

        ParkingSlot parkingSlot =
                SlotAssignmentStrategyFactory
                .getSlotAssignmentStrategyByType(parkingLot.getSlotAssignmentStrategyType())
                .assignSlot(parkingLot , vehicleType);

        ticket.setParkingSlot(parkingSlot);
        // 3. Return the data
        return ticketRepository.save(ticket);
    }
}

// issueTicket

// Code models
// controller : TicketController
// DTOs
// service : Business logic

// 1. set up the controller with proper arguments
// 2. Handled the exceptions in the controller
// 3. Ticket Service Business logic implementation
// 4. Starting preparing all the date required for Ticket object
// 5. Create repository for Gate to get the object from the id
// 6. Discussed about why Optionals are better than basic null checks
// 7. Set up the vehicle
// 8. Assign the slot
// 9. create the strategy
// 10. Strategy needs parking lot
//      10.1 either get the parking lot via a tricky process
//      10.2 get the parking lot id from the customer
//      10.3 have the parkinglot ref in the Gate so that when you get the gate , you automatically get the parking lot also