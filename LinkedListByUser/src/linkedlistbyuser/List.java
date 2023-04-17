
package linkedlistbyuser;
import java.util.Scanner;

public class List {
     int k;
    Node head, tail;
    Scanner scanner = new Scanner(System.in);

    public void Create() {
        System.out.println("Enter the number of nodes you want to create: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            Node temp = new Node();
            System.out.println("Enter the data you want to insert in the node " + i);
            k = scanner.nextInt();

            temp.data = k;
            temp.next = null;

            //To check the head of node
            if (head == null) { //Agar pehlay node na create ki ho toh
                head = temp;
                tail = head;
            } else {
            //Tail yahan par pichlay waala node hai, us k ander temp yeni aglay waalay node ka address rakh do
                tail.next = temp;
            //Ab jo naya temp hai usay tail bana do
                tail = temp;
            }
        }
    }

//      void reverse(int size){
//          Node first=head;
//          Node last=new Node();
//          last=tail;
//          int i;
//          for(i=0;i<n/2;i++){
//              int rev=last.data;
//              last.data=first.data;
//              first.data=rev;
//              first=first.next;
//            //  last=last.previous;
//          }
//      }
    public void Display() {
        if (head == null) {
            System.out.println("Node doesn't exist ");
        } 
        else {
        //Head ka data aur address temp mein store kar do
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
        //Temp k pass us say aglay waalay ka address hai
                temp = temp.next;
            }
        }
    }   
}
