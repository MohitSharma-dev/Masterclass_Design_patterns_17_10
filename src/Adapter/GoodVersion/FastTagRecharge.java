package Adapter.GoodVersion;

public class FastTagRecharge {
    public boolean recharge(BankAPI bankAPI , int amount){
        if(bankAPI.checkBalance("123") > amount){
            System.out.println("Recharge successfully done!");
            return true;
        }
        throw new RuntimeException("Insufficient funds");
    }
}
