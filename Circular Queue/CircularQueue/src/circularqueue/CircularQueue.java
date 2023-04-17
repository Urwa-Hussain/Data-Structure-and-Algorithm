
package circularqueue;

public class CircularQueue {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.isEmpty();
        queue.isFull();
        queue.Enqueue(50);
        queue.Enqueue(100);
        queue.Enqueue(150);
        queue.Enqueue(250);
        queue.Enqueue(350);
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Display();
    }
}
