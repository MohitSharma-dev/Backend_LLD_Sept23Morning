package ParkingLot.strategies;

import ParkingLot.models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy {
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()) {
                if(parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY) &&
                parkingSlot.getVehicleType().equals(vehicleType)) {
                    parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
                    return parkingSlot;
                }
            }
        }
        return null;
    }
}
