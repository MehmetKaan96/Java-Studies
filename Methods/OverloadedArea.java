

public class OverloadedArea {

    static float area(float length, float breadth)
    {
        return length * breadth;
    }

    static double area(double radius)
    {
        double pi = Math.PI;
        return pi*radius*radius;
    }

    static double area(double a,double b, double height)
    {
        return 1/2*((a+b)*height);
    }

    public static void main(String[] args) {
        System.out.println(area(15,20));
        System.out.println("----------------------");
        System.out.println(area(5));
        System.out.println("----------------------");
        System.out.println(area(5.5,3.5,12));
        
    }
}
