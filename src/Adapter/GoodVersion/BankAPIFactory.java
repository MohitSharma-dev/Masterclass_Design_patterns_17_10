package Adapter.GoodVersion;

public class BankAPIFactory {
    public static BankAPI getBankAPIByBankName(String bankName) {
        BankAPI bankAPI = null;
        if(bankName.equals("YesBank")){
            bankAPI = new YesBankAPIAdapter();
        } else if (bankName.equals("ICICIBank")){
            bankAPI = new ICICIBankAPIAdapter();
        }
        return bankAPI;
    }
}

// Factory Method
// Abstract Factory