public class student_challenge_3 {
    public static void main(String[] args) {
        /*
        Student Challenge-3 
        Remove Special characters from a string
        Remove extra space from string
        Find number of words in a String
        */

        //Remove Special characters from a string
        String str1 = "Meh.met%K$aa(N";
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);

        //Remove extra space from string
        String str2 = "Mehmet    Kaan";
        str2 = str2.replaceAll("\\s+"," ");
        System.out.println(str2);

        //Find number of words in a String
        String str3 = "Meh met Ka an";
        str3 = str3.replaceAll("\\s+"," ");
        String str[]=str3.split("\\s");
        System.out.println(str.length);
        
    }
}
