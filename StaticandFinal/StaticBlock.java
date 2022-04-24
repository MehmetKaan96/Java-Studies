class StaticTest{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}


public class StaticBlock {

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        System.out.println("This is Main");
        /*Main will be printed last if we create an object of a class
        StaticTest before everything, Main will be printed first if we 
        create an object of a class StaticTest after everything*/
        //StaticTest st2 = new StaticTest();
    }

}
