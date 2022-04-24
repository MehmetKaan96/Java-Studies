/*Singleton class is a class that can have only one object
  more than one objects of a class are not allowed
*/

class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine myCoffe= null;

    private CoffeeMachine(){
        coffeeQty = 1;
        waterQty = 1;
    }

    static public CoffeeMachine getInstance(){
        if(myCoffe == null)
        myCoffe = new CoffeeMachine();
        return myCoffe; 
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        //CoffeeMachine c = new CoffeeMachine();//The constructor CoffeeMachine is not visible

        CoffeeMachine c = CoffeeMachine.getInstance();//Singleton example

    }
}
