
package dequeueusingcirculararray;
import java.util.Scanner;
public class DequeueUsingCircularArray {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            if (queue.isFull()) {
                System.exit(0);
            }
            System.out.println("Enter 1 to enqueue at rear, 2 to enqueue at front, 3 to dequeue at rear, 4 to dequeue at front, Enter 0 to exit ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("ENter the item you want to insert: ");
                int item = sc.nextInt();
                queue.insertionAtRear(item);
                queue.Display();
            }
            if (choice == 2) {
                System.out.println("ENter the item you want to insert: ");
                int item = sc.nextInt();
                queue.insertionAtFront(item);
                queue.Display();
            }
            if (choice == 3) {
                queue.DeletionAtRear();
                queue.Display();
            }
            if (choice == 4) {
                queue.DeletionAtFront();
                queue.Display();
            }
            if (choice == 0) {
                System.exit(0);
            }
        }
    }  
}
