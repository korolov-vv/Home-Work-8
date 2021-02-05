public class MyLinkedList implements MyList {
    int size;
    Node<Object> firstNode;
    Node<Object> lastNode;

    public void add(Object value){
        Node<Object> newNode = new Node<>(null, value, null);
        if (firstNode == null) {
            newNode.next = null;
            newNode.prev = null;
            firstNode = newNode;
        } else {
            lastNode.next = newNode;
            newNode.prev = lastNode;
        }
        lastNode = newNode;
        size++;
    }// добавляет элемент в конец

    public void remove(int index){
        if (index < 0 || index >= size) {
            System.out.println("The element does not exist");
        }
        Node<Object> result = firstNode;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        Node<Object> prevElem = result.prev;
        Node<Object> nextElem = result.next;
        prevElem.next = nextElem;
        nextElem.prev = prevElem;
        result.next = null;
        result.prev = null;
    }// удаляет элемент под индексом

    public void clear(){
        firstNode = null;
        lastNode = null;
        size = 0;
    }// очищает коллекцию

    public int size(){
        size = 1;
        if(firstNode == null){return 0;}
        Node<Object> result = firstNode;
        while (result.next != null){
            result = result.next;
            size++;
        }
        return size;
    }// возвращает размер коллекции

    public Object get(int index){
        if (index < 0 || index >= size) {
            System.out.println("The element does not exist");
        }
        Node<Object> result = firstNode;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result;
    }// возвращает элемент под индексом


    private static class Node<Object> {

        Object item;
        MyLinkedList.Node<Object> next;
        MyLinkedList.Node<Object> prev;

        Node(MyLinkedList.Node<Object> prev, Object element, MyLinkedList.Node<Object> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
