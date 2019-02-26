public class BankAccount
{
    private String name;
    private String address;
    private String accountID;
    private double balance;
    private double interest;
    
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
      return name;
    }
    public void setAccountID(String i)
    {
        accountID=i;
    }
    public String getAccountID()
    {
      return accountID;
    }
    public void setAddress(String a)
    {
        address=a;
    }
    public String getAddress()
    {
      return address;
    }
    
    public void setBalance(double c)
    {
      balance=c;
    }
    public double getBalance()
    {
      return balance;
    }
    public double addInterest()
    {
      return .07*balance;

    }
}
      
    