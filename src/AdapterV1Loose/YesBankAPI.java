package AdapterV1Loose;

public class YesBankAPI {
    int transferAmount = 0;
    public int getBalance(){
        return 100;
    }

    public void moneyTransfer(){
        System.out.println("Money is transferred via Yes Bank!");
    }

    public void setTransferAmount(int amount){
        transferAmount = amount;
    }
}
