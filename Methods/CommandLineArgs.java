public class CommandLineArgs {
    public static void main(String[] args) {
        /*Add numbers using Command Line Args*/
        double sum = 0;
        for (String numbers : args) {
            double d = Double.parseDouble(numbers);
            sum += d;
        }
        System.out.printf("%f ",sum);

        /*
        komutlar
        1-javac CommandLineArgs.java
        2-java CommandLineArgs {sayılar} i.e 10,20,30
        */
    }
}
