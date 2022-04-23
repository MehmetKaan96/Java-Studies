
class Circle{
    public double radius;

    public double area()
    {
        return radius*radius*Math.PI;
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

public class CircleClass {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.radius = 12.4;
        System.out.printf("%.3f \n",circle.area());
        System.out.printf("%.3f \n",circle.perimeter());
        System.out.printf("%.3f ",circle.circumference());
    }
}