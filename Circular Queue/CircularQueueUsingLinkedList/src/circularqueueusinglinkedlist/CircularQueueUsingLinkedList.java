
package circularqueueusinglinkedlist;

public class CircularQueueUsingLinkedList {

    public static void main(String[] args) {
        List list = new List();
        list.isEmpty();
        list.Enqueue(50);
        list.Enqueue(100);
        list.Enqueue(150);
        list.Enqueue(200);
        list.Enqueue(250);
        list.Dequeue();
        list.Dequeue();
        list.Dequeue();
        list.Enqueue(50);
        list.Enqueue(100);
        list.Enqueue(150);
        list.Display();
    }
    
}
