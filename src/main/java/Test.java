public class Test {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        MyQueue myQueue = new MyQueue();
        MyStack myStack = new MyStack();
        MyLinkedList myLinkedList = new MyLinkedList();

        myList.add("first object");
        myList.add("second object");
        myList.add("third object");
        myList.add("fourth object");
        myList.add("fifth object");
        myList.add("sixth object");
        myList.add(null);
        System.out.println(myList.get(6));
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        myList.remove(2);
        myList.add("obj");
        System.out.println(myList.get(2));
        System.out.println(myList.get(5));
        System.out.println(myList.size());
        myList.clear();
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
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size());
        System.out.println("First element of queue " + myQueue.peek());

        System.out.println();
        System.out.println("<//////////////////////////////////////////////>");
        System.out.println();

        System.out.println(myQueue.size());
        myStack.push("apple");
        myStack.push("watermelon");
        myStack.push("peach");
        myStack.push("cherry");
        myStack.push("grape");
        myStack.push("apricot");
        myStack.push("pinapple");
        System.out.println(myQueue.size());
        System.out.println("First element of queue " + myStack.peek());
        myStack.poll();
        System.out.println(myStack.size());
        System.out.println("First element of queue " + myStack.peek());

        System.out.println();
        System.out.println("<*********************************************>");
        System.out.println();

        myLinkedList.add("first object");
        myLinkedList.add("second object");
        myLinkedList.add("third object");
        myLinkedList.add("fourth object");
        myLinkedList.add("fifth object");
        myLinkedList.add("sixth object");
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(3);
        System.out.println(myLinkedList.size());
        myLinkedList.clear();
        System.out.println(myLinkedList.size());

    }
}
