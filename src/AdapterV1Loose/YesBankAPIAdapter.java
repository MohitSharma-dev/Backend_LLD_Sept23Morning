package AdapterV1Loose;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void transerMoney(int amount) {
        yesBankAPI.setTransferAmount(amount);
        yesBankAPI.moneyTransfer();
    }

    void rtgsPayment(){
        throw new UnsupportedOperationException("Not supported yet by this bank. Please change the bank to do this operation");
    }
}
