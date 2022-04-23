/**
 * regular_expression
 */
public class regular_expression {

    public static void main(String[] args) {
        /*Symbols for regular expressions
        !----Matching Symbols----!
        "." - any character
        [abc] - exactly given letters
        [abc][vz] - Either first or second set
        [^abc] - Except abc
        [a-z1-7] - a-z or 1-7
        A|B     - A or B
        XZ      - Exactly XZ     
        
        !----Meta Characters----!
        \d - Digits
        \D - Not Digits
        \s - Space
        \S - Not Space
        \w Alphabets or Digits
        \W Neither alphabet or digit

        !----Quantifiers----!
        * - 0 or more time
        + - One or more time
        ? - 0 or 1 time
        {X} - X times
        {X,Y} - Between X and Y times
        */
        // String str1 = "abc";
        // System.out.println(str1.matches("[a-z0-9]"));
        // System.out.println(str1.matches("a|b"));
        // System.out.println(str1.matches("abc"));
        // System.out.println(str1.matches("\\w"));
        // System.out.println(str1.matches("\\d"));
        // System.out.println(str1.matches("\\D"));
        // System.out.println(str1.matches("\\s"));

        // String str2 = "abcdef";
        // System.out.println(str2.matches(".*"));
        // System.out.println(str2.matches("[a-z]*"));

        String str3 = "mehmet@gmail.com";
        System.out.println(str3.matches(".*gmail.*"));
        System.out.println(str3.matches("\\w*@gmail.*"));
        
    }
}

