public class JavaMethods {

    int max(int x,int y)
    {
        int result = (x>y) ? x:y;
        return result;
    }
    static int maxNumber(int x, int y)
    {
        int max = (x>y) ? x : y;
        return max;
    }
    public static void main(String[] args) {
        JavaMethods jm = new JavaMethods();
        System.out.println(jm.max(5, 6));
        /*-------------------------------*/
        System.out.println(maxNumber(20, 42));
    }
}
