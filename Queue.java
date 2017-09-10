public class Queue {
    Node first;

    public void queue(Object obj) {
        Node node = new Node(obj);
        if(first == null) {
            first = node;
        } else {
            Node n = first;
            while(n.next != null) { n = n.next; }
            n.next = node;
        } 
    }

    public Object dequeue() {
        Node n = first;
        if(first != null) {
            first = first.next;
        }
        return n;
    }
}
