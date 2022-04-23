abstract class KFC{
    KFC()
    {
        System.out.println("Welcome To The KFC.");
    }

    void makeItem()
    {
        System.out.println("Your order is preparing.");
    }
    abstract void billing();
    abstract void offer();
}

class MyKFC extends KFC{
    MyKFC()
    {
        System.out.println("Welcome To The Branch Of KFC");
    }

    void billing(){
        System.out.println("Your order is $5,99");
    }
    void offer(){
        System.out.println("Would you like the new hot coffe?");
    }

    void festiveOffer()
    {
        System.out.println("This is a festiveOffer");
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
        KFC kfc = new MyKFC();
        kfc.makeItem();
        kfc.billing();
        kfc.offer();
        
        System.out.println();

        MyKFC mkfc = new MyKFC();
        mkfc.makeItem();
        mkfc.billing();
        mkfc.offer();
        mkfc.festiveOffer();
    }
}
