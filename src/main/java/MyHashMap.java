public class MyHashMap<K, V> {

    private final int DEFAULT_CAPACITY = 16;
    private int size;
    private final MyEntry<K, V>[] buckets = new MyEntry[DEFAULT_CAPACITY];

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public MyEntry<K, V>[] getBuckets() {
        return buckets;
    }

    private int Hashing(int hashCode) {
        return hashCode % getDEFAULT_CAPACITY();
    }

    public void put(K key, V val) {
        V res = null;
        if (key == null) {
            System.out.println("Key is obligatory");
        } else {
            int location = Hashing(key.hashCode());
            if (location >= getDEFAULT_CAPACITY()) {
                System.out.println("Rehashing required");
                return;
            }
            MyEntry<K, V> e = null;

            try {
                e = getBuckets()[location];
            } catch (NullPointerException ex) {
                System.out.println("An object does not exist");
            }
            if (e != null && e.getKey() == key) {
                res = (V) e.getVal();
            } else {
                MyEntry<K, V> eNew = new MyEntry<>();
                eNew.setKey(key);
                eNew.setVal(val);
                getBuckets()[location] = eNew;
                size++;
            }
        }
    }

    public V get(K key) {
        V ret = null;
        if (key == null) {
            MyEntry<K, V> e = null;
            try {
                e = getBuckets()[0];
            } catch (NullPointerException ex) {
                System.out.println("An object does not exist");
            }
            if (e != null) {
                return (V) e.getVal();
            }
        } else {
            int location = Hashing(key.hashCode());
            MyEntry<K, V> e = null;
            try {
                e = getBuckets()[location];
            } catch (NullPointerException ex) {
                System.out.println("An object does not exist");
            }
            if (e != null && e.getKey() == key) {
                return (V) e.getVal();
            }
        }
        return ret;
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        int location = Hashing(key.hashCode());
        if (getBuckets()[location].getKey() == key) {
            if (getBuckets().length - 1 - location >= 0)
                System.arraycopy(getBuckets(), location + 1, getBuckets(), location, getBuckets().length - 1 - location);
        }
        size--;
    }

    public void clear() {
        MyEntry[] tab = getBuckets();
        for (int i = 0; i < tab.length; i++)
            tab[i] = null;
        size = 0;
    }
}

class MyEntry<K, V> {
    private K key;
    private V val;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int res = 29;
        if (getKey() != null) {
            if (prime * res + getKey().hashCode() < 0) {
                return -1 * (prime * res + getKey().hashCode());
            }
            return prime * res + getKey().hashCode();
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass().getName() != o.getClass().getName()) {
            return false;
        }
        MyEntry e = (MyEntry) o;
        return this.key == e.key;
    }
}