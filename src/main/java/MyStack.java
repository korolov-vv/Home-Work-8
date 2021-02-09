import java.util.Arrays;

public class MyStack implements MyList {

    private Object[] myArr = new Object[0];

    public Object[] getMyArr() {
        return myArr;
    }

    public void setMyArr(Object[] myArr) {
        this.myArr = myArr;
    }

    public void push(Object value) {
        int i = 0;
        while (i < getMyArr().length) {
            if (getMyArr()[i] != null) {
                i++;
            } else if ((i + 1) > getMyArr().length) {
                setMyArr(Arrays.copyOf(getMyArr(), (getMyArr().length * 2 + 1)));
                getMyArr()[i] = value;
                break;
            } else {
                getMyArr()[i] = value;
                break;
            }
        }
        if ((i + 1) > getMyArr().length) {
            setMyArr(Arrays.copyOf(getMyArr(), (getMyArr().length * 2 + 1)));
            getMyArr()[i] = value;
        } else {
            getMyArr()[i] = value;
        }
    }

    public void remove(int index) {
        if (index > getMyArr().length || index < 0) {
            System.out.println("Enter correct index");
        } else {
            for (; index < getMyArr().length - 1; index++)
                getMyArr()[index] = getMyArr()[index + 1];
        }
        setMyArr(Arrays.copyOf(getMyArr(), getMyArr().length - 1));
    }

    public void clear() {
        setMyArr(Arrays.copyOf(getMyArr(), 0));
    }

    public int size() {
        return getMyArr().length;
    }

    public Object peek() {
        return getMyArr()[getMyArr().length - 1];
    }

    public Object pop() {
        Object firstElement;
        if (getMyArr()[0] == null) {
            return "The element does not exist:(";
        }
        firstElement = getMyArr()[0];
        System.arraycopy(getMyArr(), 1, getMyArr(), 0, getMyArr().length - 1);
        return firstElement;
    }
}
