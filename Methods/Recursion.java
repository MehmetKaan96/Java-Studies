public class Recursion {

    int fun(int n)
    {
        if(n == 0 || n == 1)
            return n;
        else{
            return fun(n-2) + fun(n-1);
        }
    }
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.printf("%d ", r.fun(7));
    }
}
