package Adapter.GoodVersion;

public class UPITransaction {
    public void transfer(BankAPI bankAPI, int amount){
      if(bankAPI.checkBalance("123") > amount){
          System.out.println("Money successfully transferred");
      }
      throw new RuntimeException("Insufficient balance");
    }
}
