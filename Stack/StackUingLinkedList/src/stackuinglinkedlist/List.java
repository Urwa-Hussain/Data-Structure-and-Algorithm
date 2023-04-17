
package stackuinglinkedlist;

public class List {
    Stack top = null;

    boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Push(int item) {
        Stack temp = new Stack();
        temp.data = item;
        temp.next = null;
        if (top == null) {
            top = temp;
        } else {
            temp.next = top;
            top = temp;                         
        }
    }
        public void Pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            top = top.next;
        }
    }

    public void Peek() {
        System.out.println(top.data);
    }

    public void Display() {
        Stack temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
