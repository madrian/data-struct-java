public class Stack {
    Node top;

    public void push(Object obj) {
        Node node = new Node(obj);
        node.next = top;
        top = node;
    }

    public Object pop() {
        Node n = top;
        if(top != null) {
            top = top.next;
        }
        return n;
    }
}
