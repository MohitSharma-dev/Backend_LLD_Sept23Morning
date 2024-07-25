package ParkingLot.models;

import java.util.List;

public class ParkingSlot extends BaseModel{
    private String slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private VehicleType vehicleType;
    private ParkingFloor parkingFloor;

    public ParkingSlot(String slotNumber, ParkingSlotStatus parkingSlotStatus, VehicleType vehicleType, ParkingFloor parkingFloor) {
        this.slotNumber = slotNumber;
        this.parkingSlotStatus = parkingSlotStatus;
        this.vehicleType = vehicleType;
        this.parkingFloor = parkingFloor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
    //    private Vehicle vehicle;

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

}
