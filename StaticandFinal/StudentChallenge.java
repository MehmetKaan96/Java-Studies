import java.util.*;

class Student{
    private String name;
    private String rollNo;
    private static int count = 1;


    private String generateRollNo(){
        Date d = new Date();
        String rn = "Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }

    public Student(String name){
        this.name = name;
        rollNo = generateRollNo();
    }

    public String toString(){
        return "\nStudent number: "+rollNo+" Student name: "+this.name;
    }
}

class Account{
    private String accNo;
    private String name;
    private int birthYear;
    private long balance;
    private static int count=1;
    private String generatedAccNo(){
        Date d = new Date();
        String an = "XBNK-"+(d.getYear()+1900)+"-"+birthYear+"-"+count;
        count++;
        return an;
    }

    public Account(String name,long balance,int year)
    {
        this.name = name;
        this.balance = balance;
        this.birthYear = year;
        accNo = generatedAccNo();
    }

    public String toString(){
        return "\nAccount Number: "+accNo+" Account owner: "+name;
    }
}

class Customer{
    private String customerID;
    private String name;
    private String customerType;
    private static int countPaid = 1;
    private static int countNormal = 1;

    private String generateCustomerID(){
        Date d = new Date();
        String cid = "";
        if(customerType == "paid" || customerType == "Paid")
        {
            cid = "Member-"+(d.getYear()+1900)+"P"+countPaid;
            countPaid++;
        }
        else if(customerType == "normal" || customerType == "Normal")
        {
            cid = "Member-"+(d.getYear()+1900)+"N"+countNormal;
            countNormal++;
        }

        return cid;
    }

    public Customer(String name,String cType){
        this.name = name;
        this.customerType = cType;
        customerID = generateCustomerID();
    }

    public String toString()
    {
        return "\nCustomer ID:: "+customerID+" Customer name: "+name;
    }
    
}


public class StudentChallenge {
    public static void main(String[] args) {
        //Student class
        Student students[] = new Student[5];
        students[0] = new Student("Mehmet");
        students[1] = new Student("Temhem");
        students[2] = new Student("Mehtem");
        students[3] = new Student("Temmeh");
        students[4] = new Student("Kaan");

        for (Student student : students) {
            System.out.println(student);
        }

        //Account class
        Account accounts[] = new Account[3];
        accounts[0] = new Account("Mehmet", 1000000, 1996);
        accounts[1] = new Account("Temhem", 1500000, 1969);
        accounts[2] = new Account("Kaan", 25000000, 1996);

        for (Account account : accounts) {
            System.out.println(account);
        }

        //Customer class
        Customer customers[] = new Customer[4];
        customers[0] = new Customer("Mehmet", "Paid");
        customers[1] = new Customer("Kaan", "Normal");
        customers[2] = new Customer("Temhem", "paid");
        customers[3] = new Customer("Naak", "normal");

        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Customer cust = new Customer("John", "paid");
        System.out.println(cust.toString());
    }
}
