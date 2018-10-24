public class Account{

   private int accountNumber;
   private int balance;
   
   public void deposit(int amount){
      balance = balance + amount;
   }
   
   public void withdraw(int amount){
      balance = balance - amount; 
   }
   
   public String checkBalance(Customer customer){
      
      // The account number and 
      // name of the customer 
      // together with the balance is displayed.
      
      return accountNumber() + ", " + customer.getName() + " " + balance;
   
   }

}