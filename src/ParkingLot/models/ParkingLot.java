package ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    // Vehicle Types : capacity
    // Let's use Hashmap : don't
    // better to create another class
    private List<SupportedVehicleType> vehicleTypes;

}


// id is going to be a common attribute
// created_at , modified_at