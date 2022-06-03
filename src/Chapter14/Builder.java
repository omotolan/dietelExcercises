package Chapter14;

import java.util.Arrays;

public class Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("i love");
        /*
        * StringBuilder constructor that takes a String argument initializes the capacity to the length of the string passed as an argument plus 16.
        * */
        //the length is 6 and capacity is length plus 16
        System.out.println(builder.length());
        System.out.println(builder.capacity());

        System.out.println();
        StringBuilder builders = new StringBuilder();
        System.out.println(builders.length());
        builders.setLength(35);
        System.out.println(builders.capacity());

        System.out.println(builders.toString());

        builder.charAt(3);
        System.out.println(builder.toString());
        //replace
        builder.setCharAt(1,'k');
        System.out.println(builder.toString());
        // reverse stringBuilder
        StringBuilder s = builder.reverse();
        System.out.println(s);
        char[] d = new char[builder.length()];
        // copy to array
        builder.getChars(0,builder.length(),d,0);
        System.out.println(Arrays.toString(d));

        System.out.println("Append characteristics: ");
        int a = 89;
        boolean b = true;
        double c = 343.43;
        float p = 434.2343f;
        Long e = 37343883908392L;
        String f = "love";
        char[] g = {'s', 'n', 'a', 'k', 'e', 's'};
        StringBuilder tola = new StringBuilder("akinsola");
        tola.append(a);
        tola.append(System.getProperty("line.separator"));
        tola.append(b);
        tola.append(System.getProperty("line.separator"));
        tola.append(c);
        tola.append(System.getProperty("line.separator"));
        tola.append(p);
        tola.append(System.getProperty("line.separator"));
        tola.append(e);
        tola.append(System.getProperty("line.separator"));
        tola.append(f);
        tola.append(System.getProperty("line.separator"));
        tola.append(g);
        tola.append(System.getProperty("line.separator"));

        System.out.println(tola.toString());

        System.out.println("Concatenate characteristics: ");
        /**
         * This creates an empty StringBuilder, then appends to it the current contents of ma fol-
         * lowed by f and c. Next, StringBuilder’s method toString (which must be called explicitly
         * here) returns the StringBuilder’s contents as a String, and the result is assigned to ma.
         */

        String ma = new StringBuilder().append(f).append(c).toString();
        System.out.println(ma);

        System.out.println("insert and delete method: ");
        StringBuilder na = new StringBuilder();
        na.insert(0, g);
        System.out.println(na.toString());
        na.insert(0, " ");
        na.insert(0, g);
        System.out.println(na.toString());
        na.deleteCharAt(5);
        System.out.println(na.toString());
        na.delete(6,9);
        System.out.println(na.toString());
    }
}
