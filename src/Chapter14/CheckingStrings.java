package Chapter14;

public class CheckingStrings {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");

// use String constructors
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        String s5 = s;
        System.out.println(s5);


        String email = "akinsolatolani@yahoo.com";
        System.out.println(email.length());
        System.out.println(email.repeat(8));
        System.out.println(email.charAt(5));
        char[] mail = new char[4];
        email.getChars(2,6,mail,0);
        System.out.println(mail);
    }
}
