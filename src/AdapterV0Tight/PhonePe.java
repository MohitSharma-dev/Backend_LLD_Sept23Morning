package AdapterV0Tight;

public class PhonePe {
    YesBankAPI yb = new YesBankAPI();
    PhonePeLoan loan = new PhonePeLoan();
    FastTagRecharge ft = new FastTagRecharge();

    boolean checkLoanEligibility(){
        return loan.LoanCheck(yb);
    }

    boolean rechargeFastTag(){
        if(ft.recharge(yb , 1000) > 0)
            return true;
        else {
            throw new RuntimeException("Add more funds!");
        }
    }
}
