package circularqueue;

public class Queue {
    int front = -1;
    int rear = -1;
    int size = 5;
    int a[] = new int[size];

    boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if ((rear + 1) % size == front) {
            return true;
        } else {
            return false;
        }
    }

    void Enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        } else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            a[rear] = item;
        } else  {
            rear = (rear + 1) % size;
            a[rear] = item;
        }
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Empty!");
        } else if (front == rear) {
            rear = -1;
            front = -1;
        } else {
            front = (front + 1) % size;
        } 
    }

    void Display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            int i;
            for (i = front; i != rear; i = (i + 1) % size) {
                System.out.println(a[i]);
            }
            System.out.println(a[i]);
        }
    }
}
