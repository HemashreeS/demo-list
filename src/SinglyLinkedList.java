public class SinglyLinkedList {
    //TODO
    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyListedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = tail = node;
        size = 1;
        return head;
    }

    public void push(int nodeValue) {
        if(head == null) {
            insertSinglyListedList(nodeValue);
            return;
        } else {
            Node newNode = new Node();
            newNode.value = nodeValue;
            newNode.next = null;
            tail.next = newNode;
            size++;
            System.out.println("Hii");
        }
    }
}