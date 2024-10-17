package Adapter.BadVersion;

public class FastTagRecharge {
    public boolean recharge(YesBankAPI yesBankAPI , int amount){
        if(yesBankAPI.balanceCheck("123") > amount){
            System.out.println("Recharge successfully done!");
            return true;
        }
        throw new RuntimeException("Insufficient funds");
    }
}
