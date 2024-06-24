package AdapterV1Loose;

public class PhonePeLoan {
    public boolean LoanCheck(BankAPI yb){
        if(yb.checkBalance() > 100){
            return true;
        }
        return false;
    }
}
