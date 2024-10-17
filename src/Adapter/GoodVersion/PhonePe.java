package Adapter.GoodVersion;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private UPITransaction upiTransaction;
    private BankAPI bankAPI;

    PhonePe(BankAPI bankAPI){
        fastTagRecharge = new FastTagRecharge();
        upiTransaction = new UPITransaction();
        this.bankAPI = bankAPI;
    }

    public boolean rechargeFastTag(int amount){
        try {
            fastTagRecharge.recharge(bankAPI , amount);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean transactionViaUPI(int amount){
        try {
            upiTransaction.transfer(bankAPI , amount);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
