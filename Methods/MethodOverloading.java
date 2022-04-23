public class MethodOverloading {

    
    int max(int x, int y)
    {
        return x>y ? x:y;
    }
    static float max(float x, float y)
    {
        return x>y ? x:y;
    }
    int max(int x, int y,int z)
    {
        return x>y&&x>z ? x:(y>z?y:z);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.max(10,15));
        System.out.println("------------------");
        System.out.println(max(5f,3.3f));
        System.out.println("------------------");
        System.out.println(mo.max(12, 13,17));
    }
}
