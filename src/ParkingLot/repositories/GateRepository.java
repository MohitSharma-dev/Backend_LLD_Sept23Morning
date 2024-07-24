package ParkingLot.repositories;

import ParkingLot.models.Gate;

import javax.swing.text.html.Option;
import java.util.Optional;

public class GateRepository {
    public Optional<Gate> findGateById(int gateId){
        return Optional.empty();
    }
}

// findGateById
// 'select * from gates where id = 5';
// date -> Object : ORM