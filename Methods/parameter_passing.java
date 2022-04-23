public class parameter_passing {


    //1- Find a number is Prime
    static boolean isPrime(int value)
    {
        for (int i = 2; i < value/2; i++) 
        {   
            if(value % i == 0)
                return false;
        }
            return true;  
    }

    //2- Find GCD of 2 numbers
    static int GCD(int x,int y)
    {
        if(y != 0)
            return GCD(y, x%y);
        else
            return x;
    }

    //3- Find Max element in Array

    static int maxElement(int A[])
    {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if(A[i-1]<A[i])
            {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //There is only one parameter passing method
        
        //Student Challenge\\
        /*
            1- Find a Number is prime
            2- Find GCD of 2 numbers
            3- Find Max Element in an Array
        */

        int A[] = {91,92,93,94,95,96};
        //System.out.println(isPrime(41));
        // System.out.println(GCD(40, 16));
        System.out.println(maxElement(A));
    }
}
