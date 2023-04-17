
package dequeueusinglineararray;

public class DequeueUsingLinearArray {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.isEmpty();
        queue.isFull();
        queue.Enqueue_At_Rear(10);
        queue.Enqueue_At_Rear(20);
        queue.Enqueue_At_Rear(30);
        queue.Enqueue_At_Rear(40);
        queue.Enqueue_At_Rear(50);
        queue.Dequeue_At_Front();
        queue.Dequeue_At_Front();
        queue.Enqueue_At_Front(70);
        queue.Enqueue_At_Front(80);
        queue.Dequeue_At_Rear();
        queue.Dequeue_At_Rear();
        queue.Display();
    }
}