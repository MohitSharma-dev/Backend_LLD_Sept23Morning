package ParkingLot.models;

public class Vehicle extends BaseModel{
    private String licensePlate;
    private String ownerName;
    private VehicleType vehicleType;

    public Vehicle() {}

    public Vehicle(String licensePlate, String ownerName, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
