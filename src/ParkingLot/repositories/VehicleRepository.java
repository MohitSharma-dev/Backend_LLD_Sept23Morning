package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    Map<Integer, Vehicle> vehicles;
    public static int id = 1;

    public VehicleRepository() {
        vehicles = new HashMap<>();
    }

    public Optional<Vehicle> findVehicleByNumber(String vehicleNumber){
        for(Vehicle v : vehicles.values()){
            if(v.getLicensePlate().equals(vehicleNumber)){
                return Optional.of(v);
            }
        }
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle){
        vehicle.setId(id);
        vehicles.put(id, vehicle);
        id++;
        return vehicle;
    }
}
