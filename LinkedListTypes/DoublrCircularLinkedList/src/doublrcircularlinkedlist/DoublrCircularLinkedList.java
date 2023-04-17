
package doublrcircularlinkedlist;

import java.util.Scanner;

public class DoublrCircularLinkedList {

    public static void main(String[] args) {
        List list = new List();
        list.Create();
        
       Scanner scanner = new Scanner(System.in);
//        int value=0;       
//        System.out.println ("Enter 1 to Insertion At Start, 2 to Insertion At Particular Position and 3 to Insertion At End: ");
//        value=scanner.nextInt();
//        if(value==1){
//            list.InsertionAtStart();
//        }
//        else if(value==2){
//            list.InsertionAtParticularPosition();
//        }
//        else if(value==3){
//            list.InsertionAtEnd();
//        }
        
        int num=0;
        System.out.println ("Enter 1 to Deletion At Start, 2 to Deletion At Particular Position and 3 to Deletion At End : ");
        num=scanner.nextInt();
        if(num==1){
            list.DeletionAtStart();
        }
        else if(num==2){
            list.DeletionAtParticularPosition();
        }
        else {
        list.DeletionAtEnd();
        }

        //list.Searching();
        list.Display();
        
    }
}