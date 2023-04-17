
package priorityqueueinlinkedlist;
import java.util.Scanner;
public class List {
    Queue front = null;
    Queue rear = null;
    int n;
    Scanner sc = new Scanner(System.in);

    public void AscendingOrder() {
        System.out.println("Number of nodes..");
        n = sc.nextInt();
        System.out.println("Elements: ");
        for (int i = 1; i <= n; i++) {
            Queue temp = new Queue();
            int e = sc.nextInt();
            temp.data = e;
            temp.next = null;
            if (front == null && rear == null) {
                front = temp;
                rear = front;
            } else {
                rear.next = temp;
                rear = temp;
                Queue m;
                for (m = front; m != rear; m = m.next) {
                    for (Queue current = front; current != rear; current = current.next) {
                        int d = current.data;
                        int l = current.next.data;
                        if (d > l) {
                            int change = d;
                            d = l;
                            l = change;
                            current.data = d;
                            current.next.data = l;
                        }
                    }
                }
            }
        }
    }

    public void DescendingOrder() {
        System.out.println("Number of nodes..");
        n = sc.nextInt();
        System.out.println("Elements: ");
        for (int i = 1; i <= n; i++) {
            Queue temp = new Queue();
            int e = sc.nextInt();
            temp.data = e;
            temp.next = null;
            if (front == null && rear == null) {
                front = temp;
                rear = front;
            } else {
                rear.next = temp;
                rear = temp;
                Queue m;
                for (m = front; m != rear; m = m.next) {
                    for (Queue current = front; current != rear; current = current.next) {
                        int d = current.data;
                        int l = current.next.data;
                        if (d < l) {
                            int change = d;
                            d = l;
                            l = change;
                            current.data = d;
                            current.next.data = l;
                        }
                    }
                }
            }
        }
    }

    void Display() {
        Queue temp;
        System.out.println("The values of nodes are: ");
        if (front == null) {
            System.out.println("Empty!!!");
        } else {
            temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    } 
}
