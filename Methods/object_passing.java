public class object_passing {


    static void change(int A[],int index,int value)
    {
        A[index] = value;
    }

    static void change2(int x,int value)
    {
        x = value;
    }
    public static void main(String[] args) {

        //A is created in stack but values of a are inside Heap
        //A will be sent to a method as a reference(like a pointer)
        int A[]={2,4,6,8,10};
        change(A,2,20);//pass by reference örneği

        for (int i : A) {
            System.out.println(i);
        }
        System.out.println("\n");

        int x=10;
        change2(x, 21);//pass by value
        System.out.println(x);
    }
    
}

