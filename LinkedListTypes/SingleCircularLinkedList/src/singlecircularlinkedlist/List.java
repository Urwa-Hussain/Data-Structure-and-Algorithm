package singlecircularlinkedlist;
import java.util.Scanner;

public class List {

    Node head, tail;
    Node previous, current;
    Scanner scanner = new Scanner(System.in);

    void Create() {
        Node temp = new Node();
        temp.data = 30;
        temp.next = null;
        head = temp;
        tail = head;

        Node temp2 = new Node();
        temp2.data = 20;
        temp2.next = null;
        tail.next = temp2;
        tail = temp2;

        Node temp3 = new Node();
        temp3.data = 40;
        temp3.next = head;
        tail.next = temp3;
        tail = temp3;
    }

    public void InsertionAtStart() {
        Node temp = new Node();
        temp.data = 10;
        temp.next = null;
        temp.next = head;
        head = temp;
        tail.next = head;
    }

    public void InsertionAtEnd() {
        Node temp = new Node();
        temp.data = 50;
        temp.next = null;
        tail.next = temp;
        tail = temp;
        tail.next = head;
    }

    public void InsertionAtParticularPosition() {
        int count = 1, position;
        previous = null;
        current = head;
        Node temp = new Node();
        temp.data = 60;
        temp.next = null;
        System.out.println("Enter the position where you want to insert the node: ");
        position = scanner.nextInt();
        while (count != position) {
            previous = current;
            current = current.next;
            count++;
        }
        if (count == position) {
            previous.next = temp;
            temp.next = current;
        }
    }

    public void DeletionAtStart() {
        head = head.next;
        tail.next = head;
    }

    public void DeletionAtEnd() {
        previous = null;
        current = head;
        while (current != tail) {
            previous = current;
            current = current.next;
        }
        if (current == tail) {
            previous.next = head;
            tail = previous;
        }
    }

    public void DeletionAtParticularPosition() {
        int count = 1, position;
        previous = null;
        current = head;
        System.out.println("Enter the position where you want to delete the node: ");
        position = scanner.nextInt();
        while (count != position) {
            previous = current;
            current = current.next;
            count++;
        }
        if (count == position) {
            previous.next = current.next;
        }
    }

    void AscendingOrderSorting() {
        previous = head;
        current = null;
        int c;
        if (head == null) {
            System.out.println("list is empty. ");
        } else {
            while (previous.next != head) {
                current = previous.next;
                while (current != head) {
                    if (previous.data > current.data) {
                        c = previous.data;
                        previous.data = current.data; //pre ka data current ka data
                        current.data = c;
                    }
                    current = current.next;
                }
                previous = previous.next;
            }
        }
    }

    void DescendingOrderSorting() {
        previous = head;
        current = null;
        int c;
        if (head == null) {
            System.out.println("list is empty.");
        } else {
            while (previous.next != head) {
                current = previous.next;
                while (current != head) {
                    if (previous.data < current.data) {
                        c = previous.data;
                        previous.data = current.data;
                        current.data = c;
                    }
                    current = current.next;
                }
                previous = previous.next;
            }
        }
    }

    public void Searching() {
        Node temp = head;
        int pos = 1;
        System.out.println("Enter the value: ");
        int value = scanner.nextInt();
        while (temp != tail) {
            if (temp.data == value) {
                System.out.println("Element found at " + pos);
            }
            pos++;
            temp = temp.next;
        }
        if (temp.data == value) {
            System.out.println("Element found at " + pos);
        }
    }

    public void Display() {
        if (head == null) {
            System.out.println("Node doesn't exist! ");
        } else {
            Node temp = head;
            while (temp != tail) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
