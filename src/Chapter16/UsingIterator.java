package Chapter16;

import java.util.*;

public class UsingIterator {
    public static void main(String[] args) {
        String[] names = {"tola", "anu", "bisola", "timi", "jide", "akin"};
        // passed array as a list
        List<String> name = new ArrayList<>(Arrays.asList(names));
// method iterator to iterate through it
        Iterator<String> namesIterator = name.iterator();

        System.out.println(namesIterator.hasNext());
        System.out.println(namesIterator.next());

        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        String[] otherNames = {"anobi", "tobi", "tola", "matt", "deji", "bunmi"};
        List<String> otherName = new ArrayList<>(Arrays.asList(otherNames));
        remove(name, otherName);
       /* while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }*/
        for (String n : name) {
            System.out.println(n);
        }


    }

    public static void remove(Collection<String> listNames, Collection<String> otherNames) {
        Iterator<String> namesIterator = listNames.iterator();
        while (namesIterator.hasNext()) {
            if (otherNames.contains(namesIterator.next())) {
                namesIterator.remove();

            }
        }
    }

}
