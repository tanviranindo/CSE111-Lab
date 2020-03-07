/**
 *
 * @author 19101268
 */
public class Main
{
  public static void main(String[] args) 
  {
    BankAccount acc1 = new BankAccount("Tanjid","Hatirjheel","#01",1000000);
    acc1.addInterest();
    BankAccount acc2 = new BankAccount("Hasib","Mohakhali","#02",50000);
    BankAccount acc3 = new BankAccount("Arfa","Shyamoli","#03",95000);
    acc3.addInterest();
    
    System.out.println("\nName: "+acc1.getName());
    System.out.println("Address: "+acc1.getAddress());
    System.out.println("Account ID: "+acc1.getaccountID());
    System.out.println("BALANCE: "+acc1.getbalance()+" BDT");
    System.out.println("Congratulations! Your account has been credited 7% interest");
    
    System.out.println("\nName: "+acc2.getName());
    System.out.println("Address: "+acc2.getAddress());
    System.out.println("Account ID: "+acc2.getaccountID());
    System.out.println("BALANCE: "+acc2.getbalance()+" BDT");
    
    System.out.println("\nName: "+acc3.getName());
    System.out.println("Address: "+acc3.getAddress());
    System.out.println("Account ID: "+acc3.getaccountID());
    System.out.println("BALANCE: "+acc3.getbalance()+" BDT");
    System.out.println("Congratulations! Your account has been credited 7% interest");
    
  }
  
}
