package AdapterV1Loose;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankAPIName = scanner.nextLine();
        BankAPI bankAPI =  BankAPIFactory.getBankAPIByName(bankAPIName);
        PhonePe p = new PhonePe();
        p.setBankAPI(bankAPI);
    }
}
