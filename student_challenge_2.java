public class student_challenge_2 {
    public static void main(String[] args) {
        /*
        Student Challenge-2
        Find if a Number is Binary or Not
        Find if a Number is Hexa-Decimal or Not
        Find if the data in the Date format (dd/mm/yyyy)
        */

        //Find if a Number is Binary or Not
        int b=1000110;
        String str1 = String.valueOf(b);
        System.out.println(str1.matches("[0-1]*"));

        //Find if a Number is Hexa-Decimal or Not
        
        String str2 = "1A";
        System.out.println(str2.matches("[0-9A-F]+"));

        //Find if the data in the Date format (dd/mm/yyyy)
        String str3 = "20/09/1996";
        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
