package ParkingLot.models;

// 'select * from gate where id = 5'
public class Gate extends BaseModel{
    private String gateNumber;
    private Operator operator;
    private GateType gateType;
    private GateStatus gateStatus;
    private ParkingLot parkingLot;

    public Gate() {}

    public Gate(String gateNumber, Operator operator, GateType gateType, GateStatus gateStatus, ParkingLot parkingLot) {
        this.gateNumber = gateNumber;
        this.operator = operator;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.parkingLot = parkingLot;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }



}
