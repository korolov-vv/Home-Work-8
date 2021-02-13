import java.util.Arrays;

public class Test<K, V> {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        MyQueue myQueue = new MyQueue();
        MyStack myStack = new MyStack();
        MyLinkedList myLinkedList = new MyLinkedList();
        MyHashMap<String, String> myHashMap = new MyHashMap<>();

        System.out.println("-------------------------ArrayList--------------------------");
        System.out.println("Size = " + myList.size());
        myList.add(null);
        myList.add("first object");
        System.out.println(myList.get(1));
        myList.add("second object");
        myList.add("third object");
        System.out.println("Size = " + myList.size());
        System.out.println(Arrays.toString(myList.getMyArr()));
        myList.add("fourth object");
        myList.add("fifth object");
        myList.add("sixth object");
        myList.add(null);
        System.out.println(myList.get(6));
        System.out.println("Size before remove " + myList.size());
        System.out.println(myList.get(2));
        myList.remove(2);
        System.out.println("Size after remove " + myList.size());
        myList.add("obj");
        System.out.println(myList.get(2));
        System.out.println(myList.get(5));
        System.out.println(myList.size());
        myList.clear();
        System.out.println(myList.size());
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        myList.add("sixth object");
        System.out.println(myList.size());

        System.out.println();
        System.out.println("<--------------------QUEUE------------------------------->");
        System.out.println();

        System.out.println(myQueue.size());
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        System.out.println("Size before remove " + myQueue.size());
        myQueue.remove(5);
        System.out.println("Size after remove " + myQueue.size());
        System.out.println("First element of queue " + myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size());
        System.out.println("First element of queue " + myQueue.peek());

        System.out.println();
        System.out.println("<///////////////////STACK///////////////////////////>");
        System.out.println();


        myStack.push("apple");
        myStack.push("watermelon");
        myStack.push("peach");
        myStack.push("cherry");
        myStack.push("grape");
        myStack.push("apricot");
        myStack.push("pinapple");
        System.out.println("Size before " + myStack.size());
        myStack.remove(4);
        System.out.println("Size after " + myStack.size());
        System.out.println("First element of queue " + myStack.peek());
        myStack.pop();
        System.out.println(myStack.size());
        System.out.println("First element of queue " + myStack.peek());
        System.out.println(myStack.pop());

        System.out.println();
        System.out.println("<********************LinkedList*************************>");
        System.out.println();

        myLinkedList.add("first object");
        myLinkedList.add("second object");
        myLinkedList.add("third object");
        myLinkedList.add("fourth object");
        myLinkedList.add("fifth object");
        myLinkedList.add("sixth object");
        System.out.println("The size is " + myLinkedList.size());
        System.out.println("The second item is  " + myLinkedList.get(2));
        myLinkedList.remove(3);
        System.out.println("The size after remove " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println(myLinkedList.size());

        System.out.println();
        System.out.println("><><><><><><><><><>HashMap<><><><><><><><><><><><><><><><");
        System.out.println();

        myHashMap.put("AA9040BB", "Audi");
        myHashMap.put("AA9041AX", "Opel");
        myHashMap.put("AA8533BA", "Lada");
        myHashMap.put("AA9087UY", "Ferrari");
        System.out.println(myHashMap.get("AA9041AX"));
        System.out.println("The size before remove " + myHashMap.size());
        myHashMap.remove("AA8533BA");
        System.out.println("The size after remove " + myHashMap.size());
        System.out.println(myHashMap.get("AA8533BA"));
        System.out.println("Size is " + myHashMap.size());
        myHashMap.clear();
        System.out.println(myHashMap.get("AA9041AX"));
        System.out.println("Size = " + myHashMap.size());
    }
}
