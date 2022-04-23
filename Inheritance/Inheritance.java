package Inheritance;

class Circle
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}

class Cylinder extends Circle
{
    public double height;

    public double volume()
    {
        return area()*height;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();

        cyl.radius = 7;
        cyl.height = 10.5;

        System.out.printf("Volume: %.1f\n",cyl.volume());
        System.out.printf("Area: %.1f\n",cyl.area());
    }
}
