package DSA;

public interface IMap<k, V> {
    boolean isEmpty();

    int size();

    void put(Object key, Object data) throws DuplicatedKeyValue;

    boolean containsKey(Object key);

    boolean containsData(Object data);

    Object get(Object key);

    void clear();

    V remove(Object key);

    boolean remove(Object key, Object data);

    V replace(Object key, Object data);

    boolean replace(Object key, Object oldData, Object newData);


}
