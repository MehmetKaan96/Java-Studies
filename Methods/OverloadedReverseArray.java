public class OverloadedReverseArray {

    static int reverse(int number)
    {
        int temp=0,n = number,rev=0;
        while(n>0)
        {
            temp = n %10;
            rev = rev*10 + temp;
            n = n/10;
        }
        return rev;
    }

    static int[] reverse(int A[])
    {
        int B[] = new int[A.length];
        for (int i = A.length-1,j=0;i >= 0; i--,j++) 
        {
               B[j] = A[i];
        }  
        return B;
    }

    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z]*");
    }

    static boolean validate(int age)
    {
        return (age >= 3 && age <=15);
    }
    public static void main(String[] args) {
        // int A[] = {1,2,3,4,5,6};
        // System.out.println(reverse(237));
        // System.out.println("-----------------");
        // for (int i : reverse(A)) 
        // {
        //   System.out.print(i+" ");  
        // }
        System.out.println(validate("Mehmet"));
        System.out.println("-----------------");
        System.out.println(validate(15));
    }
}
