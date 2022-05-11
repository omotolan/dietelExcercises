package LinkedList;

public interface List {
    void add(String item);

    String get(int index);

    String add(int index, String item);

    void remove(String item);

    void remove(int index);

    int size();
}
