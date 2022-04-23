class A{}
class B extends A{}


class Super{
  public void display()
  {
      System.out.println("Super display");
  }

  public A display2(){
      System.out.println("Super display");
      return new A();
  }
}

class Sub extends Super{
    @Override
    public void display()
    {
        System.out.println("Sub display");
    }

    @Override
    public B display2(){
        System.out.println("Sub display");
        return new B();
    }

    /*
     @Override
    public void display(int x)
    {
        System.out.println("Sub display");
    } is an example for method overloading

    @Override
    final public void display()
    {
        System.out.println("Super display");
    } is not allowed

     @Override
    static public void display()
    {
        System.out.println("Super display");
    } is not allowed
    */
}

public class OverrideRules {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.display();
        s.display2();
        
    }
}
