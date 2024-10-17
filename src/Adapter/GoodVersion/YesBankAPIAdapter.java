package Adapter.GoodVersion;

public class YesBankAPIAdapter implements BankAPI{
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int checkBalance(String account) {
        return yesBankAPI.balanceCheck(account);
    }
}
