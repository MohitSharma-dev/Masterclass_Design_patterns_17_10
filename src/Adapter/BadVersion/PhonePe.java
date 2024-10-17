package Adapter.BadVersion;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private UPITransaction upiTransaction;
    private YesBankAPI yesBankAPI;

    PhonePe(){
        fastTagRecharge = new FastTagRecharge();
        upiTransaction = new UPITransaction();
        yesBankAPI = new YesBankAPI();
    }

    public boolean rechargeFastTag(int amount){
        try {
            fastTagRecharge.recharge(yesBankAPI , amount);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean transactionViaUPI(int amount){
        try {
            upiTransaction.transfer(yesBankAPI , amount);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
