
interface Test {
    void meth1();

    void meth2();
}

class MyTest implements Test {

    @Override
    public void meth1() {
        System.out.println("Method1 of class MyTest");

    }

    @Override
    public void meth2() {
        System.out.println("Method2 of class MyTest");

    }

    public void meth3(){
        System.out.println("Method3 of class MyTest");
    }
}

public class Interfacepractice {
    public static void main(String[] args) {
        //Test t;// We can allowed to have interface references
        // Test t1 = new Test();//it's not allowed to have an interface object

        //Dynamic Method Dispatch example
        //       |
        //       v
        Test t2 = new MyTest();
        //methods will be called based upon the object
        t2.meth1();
        t2.meth2();
        //t2.meth3();//cannot call meth3() because the reference Test class has no method of meth3()
        System.out.println();

        MyTest mt = new MyTest();
        //methods will be called based upon the object
        mt.meth1();
        mt.meth2();
        mt.meth3();

    }
}