public class MyHashMap<K, V> {

    private final int DEFAULT_CAPACITY = 16;
    private int size;
    private final MyEntry<K, V>[] buckets = new MyEntry[DEFAULT_CAPACITY];

    private int Hashing(int hashCode) {
        return hashCode % DEFAULT_CAPACITY;
    }

    public void put(K key, V val) {
        V res = null;
        if (key == null) {
            System.out.println("Key is obligatory");
        } else {
            int location = Hashing(key.hashCode());
            if(location >= DEFAULT_CAPACITY) {
                System.out.println("Rehashing required");
                return;
            }
            MyEntry<K, V> e = null;

            try{
                e = buckets[location];
            }catch(NullPointerException ex) {
                System.out.println("An object does not exist");
            }
            if (e != null && e.getKey() == key) {
                res = (V) e.getVal();
            } else {
                MyEntry<K, V> eNew = new MyEntry<>();
                eNew.setKey(key);
                eNew.setVal(val);
                buckets[location] = eNew;
                size++;
            }
        }
    }

    public V get(K key) {
        V ret = null;
        if(key == null) {
            MyEntry<K, V> e = null;
            try{
                e = buckets[0];
            }catch(NullPointerException ex) {
                System.out.println("An object does not exist");
            }
            if(e != null) {
                return (V) e.getVal();
            }
        } else {
            int location = Hashing(key.hashCode());
            MyEntry<K, V> e = null;
            try{
                e = buckets[location];
            }catch(NullPointerException ex) {
                System.out.println("An object does not exist");
            }
            if(e!= null && e.getKey() == key) {
                return (V)e.getVal();
            }
        }
        return ret;
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        int location = Hashing(key.hashCode());
        if(buckets[location].getKey() == key) {
            if (buckets.length - 1 - location >= 0)
                System.arraycopy(buckets, location + 1, buckets, location, buckets.length - 1 - location);
        }
    }

    public void clear(){
        MyEntry[] tab = buckets;
        for (int i = 0; i < tab.length; i++)
            tab[i] = null;
        size = 0;
    }
}

class MyEntry<K, V> {
    K key;
    V val;

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
        if (key != null) {
            if(prime * res + key.hashCode() < 0){return -1 * (prime * res + key.hashCode());}
            return prime * res + key.hashCode();
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