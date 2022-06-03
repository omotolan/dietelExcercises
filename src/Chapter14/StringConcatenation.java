package Chapter14;

public class StringConcatenation {
    public static void main(String[] args) {
        String first = "i love";
        String second = " you";
       // first = first + second;

        /*
        * concatenates two String objects (similar to using the + operator) and returns a new String object containing the characters from both original
        * Strings. The expression s1.concat(s2) at line 11 forms a String by appending the
        * characters in s2 to the those in s1. The original Strings to which s1 and s2 refer are not modified
        * */
        System.out.println(first + second);
        System.out.println(first.concat(second));

        //method replace
        String third = "      hey    ";
        System.out.println(first.replace('i', 'u'));
        //trim empty spaces in beginning and ending
        System.out.println(third.trim());
        // load array
        String some = "iloveyou";
        char[] forth;
        forth = some.toCharArray();

        for (char letter : forth) {
            System.out.println(letter);
        }

        //VALUE OF: returns value of a variable
        int a = 89;
        boolean b = true;
        double c = 343.43;
        float d = 434.2343f;
        Long e = 37343883908392L;
        String f = "love";
        char[] g = {'s', 'n', 'a', 'k', 'e', 's'};
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(e));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(g));
        System.out.println(String.valueOf(g,2,4));

    }
}
