package Inheritance;

class Account{
    private String accNo;
    private String fName;
    private String address;
    private String phoneNo;
    private String dateofbirth;
    protected double balance;

    public Account(String acc,String name,String addr,String phone,String dob)
    {
        accNo = acc;
        fName = name;
        address = addr;
        phoneNo = phone;
        dateofbirth = dob;
        balance = 0;
    }

    public String getAccNo(){return accNo;}
    public String getFullName(){return fName;}
    public String getAddress(){return address;}
    public String getPhoneNo(){return phoneNo;}
    public String getDateOfBirth(){return dateofbirth;}
    public double getBalance(){return balance;}

    public void setAddress(String add){address = add;}
    public void setPhoneNo(String phone){phoneNo = phone;}
}

class SavingsAccount extends Account
{

    public SavingsAccount(String acc, String name, String addr, String phone, String dob) {
        super(acc, name, addr, phone, dob);
    }

    public void deposit(double amount){balance += amount;}

    public void withdraw(double amount){balance -= amount;}
}

class LoanAccount extends Account{

    public LoanAccount(String acc, String name, String addr, String phone, String dob) {
        super(acc, name, addr, phone, dob);
        
    }
    
    public void payEMI(double amount){balance -= amount;}
    public void repay(double amount){
        if(balance == amount)
            balance = 0;
    }
}

public class Challenge1 {
    public static void main(String[] args) {
        
    }
}
