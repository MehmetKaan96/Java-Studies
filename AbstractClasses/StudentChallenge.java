/*
    Create a base class name Shape and create two child class
    named Circle and Rectangle

    Shape should be abstract,Rectangle and Circle should inherit from Shape

    Shape properties:
    No properties
    Shape methods:
    perimeter();//abstract
    area();//abstract

    Circle (extends Shape)
    Circle properties
    -radius
    Circle methods
    perimeter();//Override from Shape
    area();//Override from Shape

    Rectangle (extends Shape)
    Rectangle properties
    -length
    -breadth
    Rectangle methods
    perimeter();//Override from Shape
    area();//Override from Shape
*/

abstract class Shape {
    abstract double area();

    abstract double perimeter();
}

class Circle extends Shape {
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    public double length;
    public double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return length*breadth;
    }

    @Override
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}

public class StudentChallenge {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.26);
        System.out.printf("Area of this circle is: %.1f\n",s1.area());
        System.out.printf("Perimeter of this circle is: %.1f\n",s1.perimeter());
        System.out.println();

        Shape s2 = new Rectangle(9.9, 4.2);
        System.out.printf("Area of this rectangle is: %.1f\n",s2.area());
        System.out.printf("Perimeter of this rectangle is: %.1f\n",s2.perimeter());
    }
}
