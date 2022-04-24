/*Static keyword is used for representing metadata(metadata means data
about data).So basically they are useful for representing the information
of a class

If we have only data related to a class, then we can use just static variables

If that data needs some processing and if we have to do some computations,
then we can use static methods

If we have a lot of data and that can be group together we can use static nested class


!!!!!!!!!Important!!!!!!!
Static members are shared by all the objects of a class(all objects share the same static member)
Static members of a class are created inside of Method area(not in heap or stack)

*/

class HondaCity{
    static long price = 10;//Static member example
    int a,b; 

    //Static method example
    //Static methods can access only static members
    static double onRoadPrice(String city)
    {
        switch (city) {
            case "Istanbul":
                return price+price*0.1;
            case "Ankara":
                return price+price*0.095;
        }

        return price;
    }
}
public class StaticMembers {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();

        /*Static members can be accessed just using class name, we don't have to create an 
        object for reaching a static member*/ 
        System.out.println(HondaCity.price);//10
        System.out.println(HondaCity.price);//10
        System.out.println(HondaCity.onRoadPrice("Istanbul"));
        System.out.println(HondaCity.onRoadPrice("Ankara"));
        // h1.price = 20;
        // System.out.println(h1.price);//20
        // System.out.println(h2.price);//20

        
        


    }
    
}