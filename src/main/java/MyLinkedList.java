public class MyLinkedList implements MyList {

    private int size;
    private Node<Object> firstNode;
    private Node<Object> lastNode;

    public int getSize() {
        return size;
    }

    public Node<Object> getFirstNode() {
        return firstNode;
    }

    public Node<Object> getLastNode() {
        return lastNode;
    }

    public void setFirstNode(Node<Object> firstNode) {
        this.firstNode = firstNode;
    }

    public void setLastNode(Node<Object> lastNode) {
        this.lastNode = lastNode;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(Object value) {
        Node<Object> newNode = new Node<>(null, value, null);
        if (getFirstNode() == null) {
            newNode.next = null;
            newNode.prev = null;
            setFirstNode(newNode);
        } else {
            getLastNode().next = newNode;
            newNode.prev = getLastNode();
        }
        setLastNode(newNode);
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= getSize()) {
            System.out.println("The element does not exist");
        }
        Node<Object> result = getFirstNode();
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        Node<Object> prevElem = result.prev;
        Node<Object> nextElem = result.next;
        prevElem.next = nextElem;
        nextElem.prev = prevElem;
        result.next = null;
        result.prev = null;
    }

    public void clear() {
        setFirstNode(null);
        setLastNode(null);
        setSize(0);
    }

    public int size() {
        setSize(1);
        if (getFirstNode() == null) {
            return 0;
        }
        Node<Object> result = getFirstNode();
        while (result.next != null) {
            result = result.next;
            size++;
        }
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= getSize()) {
            System.out.println("The element does not exist");
        }
        Node<Object> result = getFirstNode();
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.item;
    }


    private static class Node<Object> {

        private Object item;
        private MyLinkedList.Node<Object> next;
        private MyLinkedList.Node<Object> prev;

        Node(MyLinkedList.Node<Object> prev, Object element, MyLinkedList.Node<Object> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
