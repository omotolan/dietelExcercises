package Chapter7.Turtle;

import java.util.Arrays;

public class CopyArrayWithCondition {
    public static void main(String[] args) {
        String[] names = {"anu", "akinsola", "bisola", "tola", "fikayo", "jide"};
        String[] newNames = new String[names.length-1];
int index = 3;

            System.out.println(Arrays.toString(names));
            System.arraycopy(names,0,newNames,0,index);
            System.arraycopy(names,index+1,newNames,index,names.length-index-1);

        names = newNames;
        System.out.println(Arrays.toString(names));

    }
}
