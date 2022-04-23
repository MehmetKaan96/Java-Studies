// class Super{
//     public void method1(){
//         System.out.println("Method 1");
//     }
//     public void method2(){
//         System.out.println("Super Method 2");
//     }
// }

// class Sub extends Super{
//     public void method2()
//     {
//         System.out.println("Sub method 2");
//     }

//     public void method3(){
//         System.out.println("Method 3");
//     }
// }


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        /*Dynamic Method Dispatch is useful for achieving runtime polymorphism
        using method overriding*/

    /*Reference      Object
          |             |      
          v             v     */
        Super s = new Sub();//Allowed
        s.method1();
        s.method2();//prints "Sub method 2"
        //s.method3 cannot be called because the reference is from super class
        /*Sub su = new Super() is not allowed*/

    }
}
