package DSA;

public class MyArrayList implements CustomList{
    private String[] array = new String[5];
    private int counter;

    @Override
    public boolean isEmpty() {
        if(counter == 0){
            return true;
        }
        else return false;
    }

    @Override
    public void add(String item) {
        array[counter] = item;
        counter++;

    }

    @Override
    public void add(int index, String item) {
            array[index] = item;
            counter++;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }


    }

    @Override
    public boolean contains(String item) {
        for (String element : array){
            if (item.equals(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        String item = null;

            try {
                for (int i = 0; i < array.length; i++) {
                    item = array[index];
                }
            }
            catch (Exception e){
                System.out.println("Index of of bound waray");

        }
        return item;
    }

    @Override
    public int indexOf(String item) {
        String element;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            if (item.equals(element)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(String item) {
        for(String element : array){
            if (item.equals(element)){

            }
        }

    }

    @Override
    public void remove(int index) {
       String[] newArray = new String[array.length -1];
        for (int i = 0, k = 0; i < array.length; i++) {
if (i == index){
    continue;
}
            newArray[k++] = array[i];
           // System.arraycopy(array, 0, newArray, 0, array.length - 1);
        }
        array = newArray;

    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void set(int index, String item) {
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                array[index] =item;
            }

        }

    }
}
