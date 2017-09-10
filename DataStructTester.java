public class DataStructTester {

    public static void main(String[] args) {
        testLinkedList();
        testStack();
        testQueue();
    }

    private static void testLinkedList() {
        LinkedList l = new LinkedList();
        l.add(new Integer(1));
        l.add(new Integer(3));
        l.add(new Integer(5));
        l.add(new Integer(9));
        l.add(new Integer(-7));
        l.add(new Integer(12));
        l.add(new Integer(0));
        l.add(new Integer(16));
        System.out.println("Init linked list:");
        print(l.head);
        l.remove(new Integer(5));
        System.out.println("Removed 5:");
        print(l.head);
        l.remove(new Integer(1));
        System.out.println("Removed head 1:");
        print(l.head);
        l.remove(new Integer(16));
        System.out.println("Removed last 16:");
        print(l.head);
        l.remove(new Integer(88));
        System.out.println("Removed non-existing 88:");
        print(l.head);
        l.add(new Integer(17));
        System.out.println("Added 17:");
        print(l.head);
        l.remove(new Integer(3));
        l.remove(new Integer(9));
        l.remove(new Integer(-7));
        l.remove(new Integer(12));
        l.remove(new Integer(0));
        l.remove(new Integer(17));
        System.out.println("Removed all:");
        print(l.head);
        l.remove(new Integer(0));
        System.out.println("Removed from empty:");
        print(l.head);
        l.add(new Integer(9));
        System.out.println("Added 9:");
        print(l.head);
    }

    private static void testStack() {
        Stack s = new Stack();
        s.push(new Integer(1));
        s.push(new Integer(3));
        s.push(new Integer(5));
        s.push(new Integer(9));
        s.push(new Integer(-7));
        s.push(new Integer(12));
        s.push(new Integer(0));
        s.push(new Integer(16));
        System.out.println("Init stack:");
        print(s.top);
        s.pop();
        System.out.println("Popped:");
        print(s.top);
        s.pop();
        System.out.println("Popped:");
        print(s.top);
        s.pop();
        System.out.println("Popped:");
        print(s.top);
        s.pop();
        System.out.println("Popped:");
        print(s.top);
        s.push(new Integer(17));
        System.out.println("Pushed 17:");
        print(s.top);
        s.pop();
        System.out.println("Popped:");
        print(s.top);
        s.pop();
        System.out.println("Popped:");
        print(s.top);
        s.pop();
        System.out.println("Popped:");
        print(s.top);
        s.pop();
        System.out.println("Popped:");
        print(s.top);
        s.pop();
        System.out.println("Popped all:");
        print(s.top);
        System.out.println("Popped from empty:");
        s.pop();
        print(s.top);
        s.push(new Integer(9));
        System.out.println("Pushed 9:");
        print(s.top);
    }

    private static void testQueue() {
        Queue q = new Queue();
        q.queue(new Integer(1));
        q.queue(new Integer(3));
        q.queue(new Integer(5));
        q.queue(new Integer(9));
        q.queue(new Integer(-7));
        q.queue(new Integer(12));
        q.queue(new Integer(0));
        q.queue(new Integer(16));
        System.out.println("Init queue:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued:");
        print(q.first);
        q.queue(new Integer(17));
        System.out.println("Queued 17:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued:");
        print(q.first);
        q.dequeue();
        System.out.println("Dequeued all:");
        print(q.first);
        System.out.println("Dequeued from empty:");
        q.dequeue();
        print(q.first);
        q.queue(new Integer(9));
        System.out.println("Queued 9:");
        print(q.first);
    }

    private static void print(Node n) {
        if(n != null) {
            System.out.print("[");
            while(n.next != null) {
                System.out.print(n.item + ", ");
                n = n.next;
            }
            System.out.println(n.item + "]");
        }
    }
}
