package FreeStyle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveArray {
    public static void main(String[] args) {
        String[] names = {"ade", "tola", "tolu", "yusuf", "omo"};
int index =2;
String[] newNames = new String[names.length-1];
/*first parameter indicates where you wish to copy from
* second parameter indicates the start position from the array youre copying from
* third parameter indicates the new array you want to copy to
* forth parameter indicates the position you which to start from in the new array you are copying to
* fifth indicates the lenght i.e lenght of your start and end position
* */
System.arraycopy(names, 0, newNames, 0,index);
        for (int i = 0; i < newNames.length; i++) {
            System.out.println(newNames[i]);
        }
        System.arraycopy(names, index+1, newNames, index,names.length-index-1);
        for (int i = 0; i < newNames.length; i++) {
            System.out.println(newNames[i]);
        }
        names = newNames;
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
