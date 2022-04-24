
/*Local Inner Class is a class that created inside a method,this class
will be only visible and useful inside that method.

It is used for when we want any class to inherit from existing class or
implement an interface, and that class will be useful only inside a method
than we can use local inner class

------------------------------------------------------------------------

Anonymous Inner Class
Anonymous inner class can be define at the time of creation of object itself
You can define the class as well as create an object.Usually these are 
useful for interfaces and abstract classes.

Static Inner Class
Static inner classes are the static members of outer classes and the 
object of the static inner classes can be created outside the outer 
class. We can access them from anywhere, and we don't have to create the
object off outer class

*/

//Local Inner Class Example
class Out {

    void Display() {
        class In { // We created
            void innerDisp() { // A Local Inner Class
                System.out.println("Hello"); // here. It will only be
            } // useful inside the method
        }
        In i = new In();
        i.innerDisp();
    }
}

//Anonymous Inner Class Example
abstract class My {
    abstract void display();
}

class MyOuter {
    public void meth() {
        My m = new My() { // Example for anonymous inner class
            public void display() {
                System.out.println("Hello");
            }
        };
        // ^
        // |
        // Example for anonymous inner class
        // Normally we cannot create an object of an abstract class
        // but with using anonymous inner class we can create object
        // of an abstract class
        m.display();
    }
}

//Interface example for anonymous inner class
interface MyInterface{
    void show();
}

class Outer{
    public void method(){
        MyInterface mi = new MyInterface() {//Example for anonymous inner class
            public void show()
            {
                System.out.println("Hello");
            }
        };
        mi.show();
    }
}

//Static Inner Classes Example
class OuterClass{
    static int x = 10;
    int y =20;
    static class InnerClass{
        void display()
        {
            System.out.println(x);
            //System.out.println(y);//"Cannot make a static reference to the 
                                  //non-static field y" error
        }
    }
}


public class LocalAnonStaticInner {
    public static void main(String[] args) {
        //static inner class object
        OuterClass.InnerClass i = new OuterClass.InnerClass();
        i.display();
    }
}
