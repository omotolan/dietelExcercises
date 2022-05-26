package DSA;

public class Set extends MyArrayList {
    Object[] array = new Object[5];
    int counter;
    @Override
    public void add(Object obj){
       // if(counter == 0) {
            array[counter] = obj;
           counter++;
//        }
//        if (counter > 1){
//        for (String element : array) {
//            if (!item.equals(element)) {
//                array[counter] = item;
//
//            }
//        }
//            counter++;
//        }

    }
}
