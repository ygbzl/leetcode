package Feb11_49_56;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 * Created by peidong on 2/13/17.
 */
public class MinStack_155 {

    class Node{
        int val;
        int min;
        Node next;

        Node(int val, int min) {
            this.val=val;
            this.min=min;
            next=null;
        }
    }

    Node head;

    public MinStack_155() {
        head=null;
    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x);
        } else {
            Node n = new Node(x, Math.min(x, head.min));
            n.next=head;
            head=n;
        }

    }

    public void pop() {
        if (head != null) {
            head=head.next;
        }
    }

    public int top() {
        if (head != null) {
            return head.val;
        } else {
            return -1;
        }
    }

    public int getMin() {
        return head.min;
    }
}
