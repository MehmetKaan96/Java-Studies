final class Test{
    public final void show(){
        System.out.println("Hello");
    }
}

//A class cannot inherit from a final class
// class Sub extends Test{
//     //We cannot override a final method
//     // public void show(){

//     // }
// }

public class FinalPractice {

    /*when we declare final variable as a member of a class without initialization
     it's an error*/
    // final float PI;


    /*
        final float PI;
        PI=3.1425F 
        if this statement written inside a class it will give an error,to prevent the error
        we should write it like this:
        final float PI;
        {
            PI=3.1425f;
        }
    */

    // final float PI;
    // public FinalPractice(){
    //     PI=3.1425f;
    // }

    // final float PI = 3.1425f;
    public static void main(String[] args) {
        // final float PI;
        // PI = 3.1425f;
        // System.out.println(PI);
        
    }
}
