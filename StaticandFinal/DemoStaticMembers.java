class Test {
    static int x = 10;
    int y=15;

    void show() {
        // a non-static method can access static member of the class
        System.out.println(x+" "+y);
    }

    static void display() {
        System.out.println(x);
        // System.out.println(y);//cannot access non-static members of a class
                                //inside a static method.
    }
}



public class DemoStaticMembers {
    public static void main(String[] args) {
        Test test = new Test();
        test.show();
        test.x = 30;
        test.y = 50;

        Test test2 = new Test();
        test2.show();
        
    }
}
