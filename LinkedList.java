public class LinkedList {
    Node head;

    public void add(Object obj) {
        Node node = new Node(obj);
        if(head == null) {
            head = node;
        } else {
            Node n = head;
            while(n.next != null) { n = n.next; }
            n.next = node;
        }
        return;
    }

    public Object remove(Object obj) {
        Node n = head;
        Node p = null;
        while(n != null) {
            if (n.item.equals(obj)) {
                if(p != null) {
                    p.next = n.next;
                } else {
                    head = n.next;
                }
                break;
            }
            p = n;
            n = n.next;
        }
        return head;
    }
}
