// class Super{
//     public void display(){
//         System.out.println("Super Class Display");
//     }
// }

// class Sub extends Super{
//     @Override
//     public void display()
//     {
//         System.out.println("Sub Class Display");
//     }
// }

public class MethodOverriding {
    public static void main(String[] args) {
        Super su = new Super();
        su.display();//Super class's method will be called
        Sub sb = new Sub();
        sb.display();//Sub class's method will be called

        /*What happens if the reference is super class but object is
        Sub class
        *This mechanism is called Dynamic Method Dispatch*
        */
        Super sup = new Sub();
        sup.display();//Method of an object will be called
    }
}
