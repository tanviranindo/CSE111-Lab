/**
 *
 * @author 19101268
 */
public class BankAccount
{
  private String name;
  private String address;
  private String accountID;
  private double balance;
  
   public void setName(String n)
  {
      name = n;
  }   
   public void setAddress(String a)
  {
      address = a;
  }
   public void setaccountID(String aID)
  {
      accountID = aID;
  }
   public void setbalance(double b)
  {
      balance = b;
  }   
   public void addInterest()
   {
     balance += balance * 0.07;
   }
     
   
   
  public String getName()
  {
      return name;
  }
  public String getAddress()
  {
      return address;
  }
  public String getaccountID()
  {
      return accountID;
  }         
   public double getbalance()
  {
      return balance;
  }
    BankAccount() 
  {
      
  }
    BankAccount(String n, String a, String aID, double b)
    {
        name = n;
        address = a;
        accountID = aID;
        balance = b;
    }
}