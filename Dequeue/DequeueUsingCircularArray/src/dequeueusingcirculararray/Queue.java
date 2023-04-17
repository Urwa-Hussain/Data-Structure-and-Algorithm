
package dequeueusingcirculararray;

public class Queue {
    int front = -1;
    int rear = -1;
    int size = 10;
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

    public void insertionAtFront(int item) {
        if (front == -1 && rear == -1) {
            rear = 0;
            front = 0;
            a[front] = item;
        } else if (isFull()) {
            System.out.println("Queue is Full!");
        } else if (front == 0) {
            front = size - 1;
            a[front] = item;
        } else {
            front--;
            a[front] = item;
        }
    }

    public void DeletionAtFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else if (front == 0 && rear == 0) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front=0;
        } else {
            front++;
        }
    }
    
    public void insertionAtRear(int item) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        } else if (front == -1 && rear == -1) {
            rear = 0;
            front = 0;
            a[rear] = item;
        } else if (rear == size - 1 && front != 0){
            rear = 0;
            a[rear]=item;
        } else {
            ++rear;
            a[rear] = item;
        }
    }
    
    public void DeletionAtRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else if (front == 0 && rear == 0) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            --rear;
        }
    }

    void Display(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            int i;
            for (i = front; i != rear; i = (i + 1) % size) {
                System.out.println(a[i]);
            }
            System.out.println(a[rear]);
        }
    }
}
