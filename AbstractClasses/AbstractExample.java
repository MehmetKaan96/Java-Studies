abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void method1() {
        System.out.println("Method1 of Super");
    }

    abstract public void method2();
}

class Sub extends Super {
    /*
     * Normally if a class is inheriting from an abstract class,
     * that inheriting class should also become abstract class.
     * If we want to use inheriting class as concrete class
     * we should override all the abstract methods.
     */
    public Sub() {
        System.out.println("Sub Constructor");
    }

    @Override // Abstract method overrided
    public void method2() {
        System.out.println("Method2 of Sub");
    }
}

public class AbstractExample {

    public static void main(String[] args) {
        Super s = new Sub();
        Sub sb = new Sub();
        s.method1();
        s.method2();
        sb.method1();
        sb.method2();
    }
}