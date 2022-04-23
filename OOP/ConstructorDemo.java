class Rectangle{
    private double length;
    private double breadth;

    public Rectangle()
    {
        length = 0;
        breadth = 0;
    }

    public Rectangle(double l,double b)
    {
        length = l;
        breadth = b;
    }

    public Rectangle(double s)
    {
        length=breadth=s;
    }

    public double getLength(){return length;}
    public double getBreadth(){return breadth;}
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(13.5);
        System.out.printf("%.1f ", r.getLength());
        System.out.printf("%.1f ", r.getBreadth());
    }
}
