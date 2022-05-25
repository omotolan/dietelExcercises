package DSA;

public class Set extends MyArrayList {
    String[] array = new String[5];
    int counter;
    @Override
    public void add(String item){
        if(counter == 0) {
            array[counter] = item;
            counter++;
        }
        if (counter >= 1){
        for (String element : array) {
            if (!item.equals(element)) {
                array[counter] = item;
                counter++;
            }
        }

        }

    }
}
