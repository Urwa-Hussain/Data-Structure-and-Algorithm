package singlelinkedlist;
import java.util.Scanner;
public class List {
    Node head, tail;
    Node previous, current;
    Scanner scanner = new Scanner(System.in);

    void Create() {
        Node temp = new Node();
        temp.data = 20;
        temp.next = null;
        head = temp;
        tail = head;

        Node temp2 = new Node();
        temp2.data = 30;
        temp2.next = null;
        tail.next = temp2;
        tail = temp2;

        Node temp3 = new Node();
        temp3.data = 40;
        temp3.next = null;
        tail.next = temp3;
        tail = temp3;
}
        public void InsertionAtStart() {
        Node temp = new Node();
        temp.data = 10;
        temp.next = null;
        temp.next = head;
        head = temp;
    }

    public void InsertionAtEnd() {
        Node temp = new Node();
        temp.data = 50;
        temp.next = null;
        tail.next = temp;
        tail = temp;
    }

    public void InsertionAtParticularPosition() {
        int count = 1, position;
        previous = null;
        current= head;
        Node temp = new Node();
        temp.data=60;
        temp.next=null;
        System.out.println("Enter the position where you want to insert the node: ");
        position=scanner.nextInt();
        while(count!=position){
            previous=current;
            current=current.next;
            count++;
        }
        if(count==position){
            previous.next=temp;
            temp.next=current;
        }

    }
    
    public void DeletionAtStart(){
        head.next=head;
    }

    public void DeletionAtEnd(){
        
        previous = null;
        current = head;
        while (current != tail) {
            previous = current;
            current = current.next;
        }
        if (current == tail) {
            previous.next = null;
            tail = previous;
        }
    }
    
    public void DeletionAtParticularPosition() {
        int count=1,position;
        previous=null;
        current=head;
        System.out.println("Enter the position you want to delete the node: ");
        position=scanner.nextInt();
        while(count!=position){
            previous=current;
            current=current.next;
            count++;
        }
        if(count==position){
            previous.next=current.next;
        }
    }
    
    public void Searching(){
        Node temp = head;
        int count=0;
        System.out.println("Enter the value: ");
        int value=scanner.nextInt();
        while(temp!=null){
            count++;
            if(temp.data==value){
                System.out.println("Element found at "+count);
            }
            temp=temp.next;
        }  
    }
    
    public void Display() {
        if (head == null) {
            System.out.println("Node doesn't exist ");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
