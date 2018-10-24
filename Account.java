public class Account{

   private int accountNumber;
   private double balance;
   
   public Account(int accountNumber){
      this.accountNumber = accountNumber;
   }
   
   public void deposit(double amount){
   
      // The bank calculates the interest   
      // based on the interest rate and the amount just deposited,   
      // the interest and the amount is summed.
      // The sum is then added to the account balance.
      
      balance = balance + amount;
   }
   
   public void withdraw(double amount){
   
      // The bank puts on a fee of 10 kr. 
      // when a withdrawal is made, 
      // so the customer gets the requested amount, 
      // and the fee is subducted on the remaining balance of the account. 
      
      balance = balance - amount; 
   }
   
   public String checkBalance(Customer customer){
      
      // The account number and 
      // name of the customer 
      // together with the balance is displayed.
      
      return "Account No: " + accountNumber + "\n" 
      + "Name: " + customer.getName() + "\n" 
      + "Balance: "+ balance + " kr.";
   
   }

}