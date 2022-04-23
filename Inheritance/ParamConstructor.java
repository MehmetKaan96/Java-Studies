package Inheritance;

// class Parent{
//     public Parent()
//     {
//         System.out.println("Non-Param Parent Constructor");
//     }

//     public Parent(int x)
//     {
//         System.out.println("Param. Parent Constructor "+ x);
//     }
// }

// class Child extends Parent
// {
//     public Child()
//     {
//         System.out.println("Non-Param Child Constructor");
//     }
//     public Child(int x)
//     {
//         System.out.println("Param. Child Constructor");
//     }

    
//     public Child(int x, int y)
//     {
//         //Parent class'taki parameterized constructor'u çağırmak için
//         //birinci parametre çalışır
//         super(x);
//         System.out.println("Two Param. Child Constructor "+y);
//     }
// }

// class Rectangle{

//     int length;
//     int breadth;

//     Rectangle()
//     {
//         length=breadth=1;
//     }
//     Rectangle(int l, int b)
//     {
//         length = l;
//         breadth = b;
//     }
// }

// class Cuboid extends Rectangle
// {

//     int height;

//     Cuboid()
//     {
//         height = 1;
//     }

//     Cuboid(int h)
//     {
//         height = h;
//     }

//     Cuboid(int l ,int b,int h)
//     {
//         super(l,b);
//         height = h;
//     }

//     int volume()
//     {
//         return length*breadth*height;
//     }
// }


public class ParamConstructor {
    public static void main(String[] args) {
        // Child c = new Child(1,1);
        // Cuboid c = new Cuboid(5,3,10);
        // System.out.println(c.volume());
    }
}
/*
Parent class'ın parameterized constructoru super() anahtar kelimesi
kullanılarak child class'tan çağırılır.
ve ilk satırda yazılmalı
*/