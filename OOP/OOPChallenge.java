class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public String getItemNo(){return itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQty(){return qty;}

    public void setPrice(double p){price = p;}
    public void setQty(int q){qty = q;}

    public Product(String item,String n)
    {
        itemNo=item;
        name=n;
        price=0;
        qty=0;
    }

    public Product(String i,String n,double p,int q)
    {
        itemNo = i;name=n;price=p;qty=q;
    }

}

class Customer{
    private int customerID;
    private String name;
    private String address;
    private int phoneNo;

    public int getCustomerID(){return customerID;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public int getPhoneNo(){return phoneNo;}

    public void setAddress(String add){address = add;}
    public void setPhoneNo(int p){phoneNo = p;}

    public Customer(int cID,String n) {
        customerID = cID;
        name = n;
    }

    public Customer(int cID,String n,String a,int pNo)
    {
        customerID = cID;
        name = n;
        address = a;
        phoneNo = pNo;
    }

}

public class OOPChallenge {
    public static void main(String[] args) {
        Product p = new Product("MK-96","Bilgisayar");
        System.out.println(p.getItemNo());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQty());
    }
}
