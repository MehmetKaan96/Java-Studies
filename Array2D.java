public class Array2D {
    public static void main(String[] args) 
    {
        /*Jagged Array*/

        int A[][];
        A = new int[3][];
        A[0] = new int[2];
        A[1] = new int[4];
        A[2] = new int[3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
