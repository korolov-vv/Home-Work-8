import java.util.Arrays;

public class MyQueue {

    Object[] myArr = new Object[0];

    public void add(Object value){
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
    } // добавляет элемент в конец

    public void remove(int index){
        if(index > myArr.length){
            System.out.println("Enter correct index");
        }else
            for( ; index < myArr.length - 1; index++)
                myArr[index] = myArr[index + 1];
    }// удаляет элемент под индексом

    public void clear(){
        myArr = Arrays.copyOf(myArr, 0);
    }// очищает коллекцию

    public int size(){
        return myArr.length;
    }// возвращает размер коллекции

    public Object peek(){
        return myArr[0];
    }// возвращает первый элемент в очереди (FIFO)

    public void poll(){
        for(int i = 0; i < myArr.length - 1; i++)
            myArr[i] = myArr[i + 1];
    }// возвращает первый элемент в очереди и удаляет его из коллекции
}