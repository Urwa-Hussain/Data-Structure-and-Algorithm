package doublylinkedlist;

import java.util.Scanner;

public class List {

    Node head, tail;
    Node back, current;
    Scanner scanner = new Scanner(System.in);

    void Create() {
        Node temp = new Node();
        temp.data = 20;
        temp.previous = null;
        temp.next = null;
        head = temp;

        Node temp2 = new Node();
        temp2.data = 30;
        head.next = temp2;
        temp2.previous = head;
        temp2.next = null;
        tail = temp2;

        Node temp3 = new Node();
        temp3.data = 40;
        tail.next = temp3;
        temp3.previous = tail;
        temp3.next = null;
        tail = temp3;
    }

    public void InsertionAtStart() {
        Node temp = new Node();
        temp.data = 10;
        temp.next = head;
        head.previous = temp;
        temp.previous = null;
        head = temp;
    }

    public void InsertionAtEnd() {
        Node temp = new Node();
        temp.data = 50;
        tail.next = temp;
        temp.previous = tail;
        temp.next = null;
        tail = temp;
    }

    public void InsertionAtParticularPosition() {
        int count = 1, position;
        back = null;
        current = head;
        Node temp = new Node();
        temp.data = 60;
        temp.next = null;
        temp.previous = null;
        System.out.println("Enter the position where you want to insert the node: ");
        position = scanner.nextInt();
        while (count != position) {
            back = current;
            current = current.next;
            count++;
        }
        if (count == position) {
            back.next = temp;
            temp.previous = back;
            current.previous = temp;
            temp.next = current;
        }
    }

    public void DeletionAtStart() {
        head = head.next;
    }

    public void DeletionAtEnd() {
        back = null;
        current = head;
        while (current != tail) {
            back = current;
            current = current.next;
        }
        if (current == tail) {
            back.next = null;
            tail = back;
        }
    }

    public void DeletionAtParticularPosition() {
        int count = 1, position;
        back = null;
        current = head;
        System.out.println("Enter the position where you want to delete the node: ");
        position = scanner.nextInt();
        while (count != position) {
            back = current;
            current = current.next;
            count++;
        }
        if (count == position) {
            Node temp = current.next;
            back.next = temp;
            temp.previous = back;
        }
    }

    public void Searching() {
        Node temp = head;
        int count = 0;
        System.out.println("Enter the value you want to search: ");
        int value = scanner.nextInt();
        while (temp != null) {
            count++;
            if (temp.data == value) {
                System.out.println("Element found at " + count);
            }
            temp = temp.next;
        }
    }

    void Display() {
        if (head == null) {
            System.out.println("Node doesn't exist!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
