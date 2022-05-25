package Chapter7.LinkedList;

public class ArrayList implements List {

    private int counter = 0;
    private String[] db = new String[5];

    @Override
    public void add(String item) {
        db[counter] = item;
        counter++;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public String add(int index, String item) {
        for (int i = 0; i < db.length; i++) {
            db[index] = item;
        }

        return null;
    }

    @Override
    public void remove(String item) {

    }

    @Override
    public void remove(int index) {
        String[] newArray = new String[db.length - 1];
        // Copy the elements from starting till index
        // from original array to the other array
        System.arraycopy(db, 0, newArray, 0, index-1);

        // Copy the elements from index + 1 till end
        // from original array to the other array
        System.arraycopy(db, index + 1,
                newArray, index,
                db.length - index - 1);

        db = newArray;
    }

    @Override
    public int size() {
        return counter;
    }
}
