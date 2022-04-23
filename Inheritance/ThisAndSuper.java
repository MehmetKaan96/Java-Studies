package Inheritance;

class Rectangle{

    int length;
    int breadth;
    int x = 10;

    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    // void display()
    // {
    //     System.out.println("Length: "+this.length);
    //     System.out.println("Breadth: "+this.breadth);
    // }
}

class Cuboid extends Rectangle
{
    int height;
    int x=20;
    Cuboid(int l,int b, int h)
    {
        super(l,b);
        height = h;
    }
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}


class Car{

    String plate;
    String color;
    int price;
    int car = 15;

    Car(String plate,String color,int price)
    {
        this.plate = plate;
        this.color = color;
        this.price = price;
    }

    void display(){
        System.out.println("Plakası: "+plate+" Rengi: "+color+" Fiyatı: "+price);
    }

}

class Renault extends Car{
    String model;
    int car = 25;
    Renault(String plate,String color,int price,String model)
    {
        super(plate,color,price);
        this.model = model;
    }

    void display()
    {
        System.out.println(super.car);
        super.display();
        System.out.println(car);
        System.out.println("Plakası: "+plate+" Rengi: "+color+" Fiyatı: "+price+" Model: "+model);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Renault rn = new Renault("34 MK 96", "Black", 45000,"Megane");
        rn.display();
    }
}
