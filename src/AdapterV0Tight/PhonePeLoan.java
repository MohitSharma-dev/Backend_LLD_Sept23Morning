package AdapterV0Tight;

public class PhonePeLoan {
    public boolean LoanCheck(YesBankAPI yb){
        if(yb.getBalance() > 100){
            return true;
        }
        return false;
    }
}
