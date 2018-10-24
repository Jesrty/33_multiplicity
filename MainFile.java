public class MainFile{

   public static void main(String[] args){
   
      Customer customer = new Customer("James");
      Account account = new Account(123456789);
      
      account.deposit(10000.00);
      String checkBal = account.checkBalance(customer);
      System.out.println(checkBal);
      
   }


}