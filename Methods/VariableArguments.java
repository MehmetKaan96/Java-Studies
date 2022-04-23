public class VariableArguments {

    static void show(int ...x)//means A[](but not exactly same)
    {
        /*parametre kısmına yazılan "..."
          variable arguments'dir yani method'a istediğimiz kadar
          parametre yollayabiliriz.
        */ 
        for (int i : x) {
            System.out.printf("%d ",i);
            
        }
    }

    // void show(int x, int ... y)
    // {
    //     //
    // }

    static void showList(int start, String ...S)
    {
        for (int i = 0; i < S.length; i++) {
            System.out.println(start+" "+S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        show();
        show(10,20,30);
        System.out.println();
        show(new int[]{3,5,7,9,11,13,15});//anonymous array
        System.out.println();
        showList(1,"Mehmet","Kaan","Naak","Temhem");

    }
}
