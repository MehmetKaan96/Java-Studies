public class student_challenge {

    public static void main(String[] args) {
        
        /*
            Student Challenge
            Find if the email id is on gmail
            Find username and domain name from email

            String str = "programmer@gmail.com";
        */
        String str = "programmer@gmail.com";
        String[] str1 = str.split("@");
        if(str1[1].matches(".*gmail.*"))
        {
            System.out.println("True");
        }
        else
            System.out.println("False");

        System.out.printf("Username: %s , Domain Name: %s\n", str1[0],str1[1]);

        /* !--------------2.Yötem--------------!*/

        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        String domain = str.substring(i+1,str.length());
        System.out.println("Username: "+uname+"\n"+"Domain: "+ domain);
        System.out.println(domain.startsWith("gmail"));
    }
    
}
