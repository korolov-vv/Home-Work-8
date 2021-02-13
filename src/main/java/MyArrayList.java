import java.util.Arrays;

public class MyArrayList implements MyList {

    private Object[] myArr = new Object[getDEFAULT_CAPACITY()];
    private int numberOfElements = 0;

    public int getDEFAULT_CAPACITY() {
        int DEFAULT_CAPACITY = 10;
        return DEFAULT_CAPACITY;
    }

    public Object[] getMyArr() {
        return myArr;
    }

    public void setMyArr(Object[] myArr) {
        this.myArr = myArr;
    }

    public void add(Object value) {

        if ((numberOfElements + 1) > getMyArr().length) {
            setMyArr(Arrays.copyOf(getMyArr(), (myArr.length * 2 + 1)));
        }

        int i = 0;
        while (i < getMyArr().length) {
            if (getMyArr()[i] != null) {
                i++;
            } else {
                getMyArr()[i] = value;
                i++;
                numberOfElements = i;
                break;
            }

        }
    }

    public void remove(int index) {

        if (index > getMyArr().length || index < 0) {
            System.out.println("Enter correct index");
        }

        for (; index < (getMyArr().length - 1); index++) {
            getMyArr()[index] = getMyArr()[index + 1];
        }

        setMyArr(Arrays.copyOf(getMyArr(), getMyArr().length - 1));
        numberOfElements--;
    }

    public void clear() {
        myArr = Arrays.copyOf(getMyArr(), 0);
        numberOfElements = 0;
    }


    public int size() {
        return numberOfElements;
    }

    public Object get(int index) {

        try {
            if (index > getMyArr().length || index < 0) {
                System.out.println("Enter correct index");
            }
            if (getMyArr()[index] == null) {
                return "The element does not exist:(";
            }
        }catch (Exception e){
            return "The element does not exist:(";
        }
        return getMyArr()[index];
    }
}