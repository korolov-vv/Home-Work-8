public class MyHashMap<K, V> {

//    private float loadfactor = 0.75f;
    private final int DEFAULT_CAPACITY = 16;
    private int size = 0;
    private final MyEntry<K, V>[] buckets = new MyEntry[DEFAULT_CAPACITY];

    private int Hashing(int hashCode) {
        //        System.out.println("Location:" + location);
        return hashCode % DEFAULT_CAPACITY;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if(this.size == 0) {
            return true;
        }
        return false;
    }

/*    public boolean containsKey(Object key) {
        if(key == null) {
            if(table[0].getKey() == null) {
                return true;
            }
        }
        int location = Hashing(key.hashCode());
        MyEntry e = null;
        try {
            e = table[location];
        }catch(NullPointerException ex) {

        }
        if(e!= null && e.getKey() == key) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object value) {
        for(int i=0; i<table.length;i++) {
            if(table[i] != null && table[i].getVal() == value) {
                return true;
            }
        }
        return false;
    }*/

    public V put(K key, V val) {
        V res = null;
        if (key == null) {
            System.out.println("Key is obligatory");
            return res;
        } else {
            int location = Hashing(key.hashCode());
            if(location >= DEFAULT_CAPACITY) {
                System.out.println("Rehashing required");
                return null;
            }
            MyEntry<K, V> e = null;

            try{
                e = buckets[location];
            }catch(NullPointerException ex) {
                System.out.println("An object does not exist");
            }
            if (e!= null && e.getKey() == key) {
                res = (V) e.getVal();
            } else {
                MyEntry<K, V> eNew = new MyEntry<>();
                eNew.setKey(key);
                eNew.setVal(val);
                buckets[location] = eNew;
                size++;
            }
        }
        return res;
    } //добавляет пару ключ + значение

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
    } // возвращает значение(Object value) по ключу

    public V remove(K key) {
        int location = Hashing(key.hashCode());
        V ret = null;
        if(buckets[location].getKey() == key) {
            for(int i = location; i < buckets.length - 1; i++) {
                buckets[i] = buckets[i+1];
            }
        }
        return ret;
    }
}// удаляет пару по ключу

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
        int prime = 3;
        int res = 5;
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
        if (this.key == e.key) {
            return true;
        }
        return false;
    }
}