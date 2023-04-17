
package queueusingarrays;

public class QueueUsingArrays {

    public static void main(String[] args) {
        Queue queue = new Queue();
        //queue.isEmpty();
       // queue.isFull();
        queue.Enqueue(50);
        queue.Enqueue(60);
        queue.Dequeue();
        queue.Display();
    }
    
}
