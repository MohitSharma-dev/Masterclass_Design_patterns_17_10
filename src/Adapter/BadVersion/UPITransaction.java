package Adapter.BadVersion;

public class UPITransaction {
    public void transfer(YesBankAPI yesBankAPI, int amount){
      if(yesBankAPI.balanceCheck("123") > amount){
          System.out.println("Money successfully transferred");
      }
      throw new RuntimeException("Insufficient balance");
    }
}
