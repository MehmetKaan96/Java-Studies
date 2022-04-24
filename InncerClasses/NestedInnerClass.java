class Outer{
    int x = 10;

    class Inner{
        int y=20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
            //We can directly access outer class's data member inside 
            //inner class
        }
    }

    public void outerDisplay(){
        Inner in = new Inner();
        in.innerDisplay();
        System.out.println("Inner class data member: "+in.y);
        System.out.println(x+in.y);
        /*We cannot directly access inner class methods and data members
        from outer class, we have to use an object*/
    }

}

public class NestedInnerClass {

    public static void main(String[] args) {
        Outer out = new Outer();
        System.out.println("Outer class data member: "+out.x);
        out.outerDisplay();

        //Inner class objesi oluşturmak için
        //usually useless to create an inner class object
        Outer.Inner in = new Outer().new Inner();
        System.out.println("Inner class data member: "+in.y);
        in.innerDisplay();
    }
}