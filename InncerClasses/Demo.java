class OuterDemo {
    public void display(){
        //creating a local class
        class InnerDemo{
            public void show(){
                System.out.println("Hello");
            }
        }

        // InnerDemo i = new InnerDemo();
        // i.show();
        new InnerDemo().show();
    }
}

class StaticOuter{
    int x = 10;
    static int y=20;

    static class My{
        public void show() {
            System.out.println(y);
            //System.out.println(x); we cannot access x,because x is not static
        }
    }

    
}

public class Demo {
    public static void main(String[] args) {
        OuterDemo o = new OuterDemo();
        o.display();

        //Creating a static class object
        StaticOuter.My outer = new  StaticOuter.My();
        outer.show();
    }
}
