class Cylinder{

    private double radius;
    private double height;

    public Cylinder()
    {
        radius = 1;
        height = 1;
    }

    public Cylinder(double r, double h)
    {
        radius = r;
        height = h;
    }

    public Cylinder(double r)
    {
        radius = r;
        height = 1;
    }

    public double getRadius(){return radius;}
    public double getHeight(){return height;}

    public void setRadius(double r){
        if(r>0)
            radius = r;
        else
            radius = 0;
    }
    public void setHeight(double h){
        if(h >0)
            height = h;
        else
            height = 0;
    }

    public double volume()
    {
        return Math.PI*radius*radius*height;
    }

    public double totalSurfaceArea()
    {
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
}


public class CylinderClass {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(13.1);
        cy.setHeight(9.6);

        System.out.printf("%.1f \n",cy.volume());
        System.out.printf("%.1f \n",cy.totalSurfaceArea());
        System.out.printf("%.1f \n",cy.lidArea());
    }
}
