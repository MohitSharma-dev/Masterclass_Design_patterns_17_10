package Adapter.GoodVersion;

public class ICICIBankAPIAdapter implements BankAPI{
    private ICICIBankAPI icicIBankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance(String account) {
        return icicIBankAPI.getBalance(account);
    }
}
