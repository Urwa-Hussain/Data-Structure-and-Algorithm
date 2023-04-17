
package priorityqueueinlinkedlist;
import java.util.Scanner;
public class PriorityQueueInLinkedList {

    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Press 1 to Enqueue elements in Ascending order: ");
        System.out.println("Press 2 to Enqueue elements in Descending order: ");
        System.out.println("Enter your Choice: ");
        choice = scanner.nextInt();
        if(choice==1){
            list.AscendingOrder();
            list.Display();
        }
        else if(choice==2){
            list.DescendingOrder();
            list.Display();
        } 
    }
}
