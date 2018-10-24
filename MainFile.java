public class MainFile{

   public static void main(String[] args){
   
      Customer customer = new Customer("James");
      Account account = new Account();
      
      account.deposit(10000);
      String checkBal = account.checkBalance(customer);
      System.out.println(checkBal);
      
   }


}