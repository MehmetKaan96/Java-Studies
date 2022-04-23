public class Challenge {

    //1-Maximum of numbers using VariableArguments
    static int Max(int ...values)
    {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if(values[i]>values[i-1])
                max = values[i];
        }
        return max;
    }
    //2-Sum of all elements using VariableArguments
    static int sumofAll(int ...x)
    {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }
    //3-Calculate Discount using VariableArguments
    double calculateDiscount(double ...price)
    {
        double sum = 0;
        for (double d : price) {
            sum += d;
        }
        if(sum < 500)
            return sum*0.10;
        else if(sum>=500 && sum <= 1000)
            return sum*0.15;
        return sum*0.20;

        
    }
    public static void main(String[] args) {
        /*1-Maximum of numbers using VariableArguments
          2-Sum of all elements using VariableArguments
          3-Calculate discount using VariableArguments
        */
        Challenge c = new Challenge();

        //System.out.printf("%d ",Max(10,20,30,45,15,50));
        //System.out.printf("%d ",sumofAll(10,20,30,45,15,50));
        System.out.printf("%f ",c.calculateDiscount(750,250));
    }
}
