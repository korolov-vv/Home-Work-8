import java.util.Arrays;

public class MyStack implements MyList {

    Object[] myArr = new Object[0];

    public void push(Object value){
        int i = 0;
        while(i < myArr.length) {
            if(myArr[i] != null){
                i++;
            }else
            if ((i + 1) > myArr.length) {
                myArr = Arrays.copyOf(myArr, (myArr.length * 2 + 1));
                myArr[i] = value;
                break;
            }else {
                myArr[i] = value;
                break;
            }
        }
        if ((i + 1) > myArr.length) {
            myArr = Arrays.copyOf(myArr, (myArr.length * 2 + 1));
            myArr[i] = value;
        }else {
            myArr[i] = value;
        }
    }

    public void remove(int index){
        if(index > myArr.length || index < 0){
            System.out.println("Enter correct index");
        }else
            for( ; index < myArr.length - 1; index++)
                myArr[index] = myArr[index + 1];
    }

    public void clear(){
        myArr = Arrays.copyOf(myArr, 0);
    }

    public int size(){
        return myArr.length;
    }

    public Object peek(){
        return myArr[myArr.length - 1];
    }

    public Object poll(){
        Object firstElement;
        if(myArr[0] == null){return "The element does not exist:(";}
        firstElement = myArr[0];
        System.arraycopy(myArr, 1, myArr, 0, myArr.length - 1);
        return firstElement;
    }
}
