import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        MyQueue myQueue = new MyQueue();
        myList.add("first object");
        myList.add("second object");
        myList.add("third object");
        myList.add("fourth object");
        myList.add("fifth object");
        myList.add("sixth object");
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        myList.remove(2);
        myList.add("obj");
        System.out.println(myList.get(2));
        System.out.println(myList.get(5));
        System.out.println(myList.size());
        myList.clear();
        System.out.println(myList.size());

        System.out.println();
        System.out.println("<--------------------------------------------------->");
        System.out.println();

        System.out.println(myQueue.size());
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        System.out.println(myQueue.size());
        System.out.println("First element of queue " + myQueue.peek());
        myQueue.poll();
        System.out.println(myQueue.size());
        System.out.println("First element of queue " + myQueue.peek());

    }
}
