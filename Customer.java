public class Customer {

   private String name;
   private Account[] accounts = new Account[3]; 
   
   
   public Customer(String name){
      this.name = name;
   }
   
   public String getName(){
      return name;
   }
   
   public void addAccount(Account ac){
      accounts[0] = ac;
   }
   
   public Account[] getAccounts(){
      return accounts;
   }
   
   }