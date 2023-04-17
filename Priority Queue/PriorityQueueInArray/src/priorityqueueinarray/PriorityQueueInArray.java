
package priorityqueueinarray;
import java.util.Scanner;
public class PriorityQueueInArray {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Press 1 to Enqueue elements in Ascending order: ");
        System.out.println("Press 2 to Enqueue elements in Descending order: ");
        System.out.println("Enter your Choice: ");
        choice = scanner.nextInt();
        if(choice==1){
            queue.AscendingOrder();
        }
        else if(choice==2){
            queue.DescendingOrder();
        } 
    }
}
