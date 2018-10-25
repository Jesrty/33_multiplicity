public class MainFile{

   public static void main(String[] args){
   
      Customer customer = new Customer("James");
      Account account = new Account(123456789);
      
      account.deposit(1999990000.00);
      String checkBal = account.checkBalance(customer);
      
      
      customer.addAccount(account);
      
      // få fat i en liste af kundens kontoer
      
      Account[] xxx = customer.getAccounts();
      
      System.out.println(xxx[0].checkBalance(customer));
       System.out.println(xxx[1].checkBalance(customer));
       System.out.println(xxx[2].checkBalance(customer));
      
      
   }
}