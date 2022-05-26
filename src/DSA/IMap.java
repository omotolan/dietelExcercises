package DSA;

public interface IMap<k,V> {
    boolean isEmpty();
    int size();
    void put(Object key, Object value) throws DuplicatedKeyValue;
    boolean containsKey(Object key);
    boolean containsValue(Object value);
    Object get(Object key);
    void clear();
    V remove(Object key);
    boolean remove(Object key, Object value);
    V replace(Object key, Object value);
    boolean replace(Object key, Object oldValue, Object newValue);


}
