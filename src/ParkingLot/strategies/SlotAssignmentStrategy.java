package ParkingLot.strategies;

import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType); ;
}

// to assign the parking slot what data is required
// vehicleType + floors
// Do we have floors directly available
// floors are in the lot
// the client sent the gateId

// using the gate object can I find the parking lot


