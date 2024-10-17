package Adapter.GoodVersion;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName = scanner.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPIByBankName(bankName)
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargeFastTag(50);
    }
}
