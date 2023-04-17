
package queueusingarrays;

public class Queue {
    int front=-1;
    int rear=-1;
    int size=100;
    int a[] = new int[size];
    
    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean isFull(){
        if(rear==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    void Enqueue(int item){
        if(isFull()){
            System.out.println("Full!");
        }
        else if(front==-1&&rear==-1){
            front = 0;
            rear = 0;
            a[rear]=item;
        }
        else{
            rear=rear+1;
            a[rear]=item;
        }
    }
    
    void Dequeue(){
        if(isEmpty()){
            System.out.println("Empty!");
        }
        else if(front==0&&rear==0){
            rear=-1;
            front=-1;
        }
        else{
            front = front+1;
        }            
    }
    void Display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        for(int i=front;i<rear;i++){
            System.out.println(a[i]);
        }
    }
}
