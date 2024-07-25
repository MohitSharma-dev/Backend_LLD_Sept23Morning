package ParkingLot.repositories;

import ParkingLot.models.Gate;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Integer, Gate> gates;
    private static int id = 1;

    public GateRepository() {
        gates = new HashMap<>();
    }

    public Gate save(Gate gate) {
        gate.setId(id);
        gates.put(id, gate);
        id++;
        return gate;
    }

    public Optional<Gate> findGateById(int gateId){
        if(gates.containsKey(gateId)){
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}

// findGateById
// 'select * from gates where id = 5';
// date -> Object : ORM