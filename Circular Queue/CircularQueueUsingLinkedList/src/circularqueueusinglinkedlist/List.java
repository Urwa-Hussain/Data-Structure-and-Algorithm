
package circularqueueusinglinkedlist;

public class List {
    Queue front = null;
    Queue rear = null;

    boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    void Enqueue(int item) {
        Queue temp = new Queue();
        temp.data = item;
        temp.next = null;

        if (front == null) {
            front = temp;
            rear = front;
            rear.next=front;
        } else {
            rear.next = temp;
            rear = temp;
            rear.next=front;
        }
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            front = front.next;
            rear.next=front;
        }
    }

    public void Display() {
        Queue temp = front;
        while (temp != rear) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
