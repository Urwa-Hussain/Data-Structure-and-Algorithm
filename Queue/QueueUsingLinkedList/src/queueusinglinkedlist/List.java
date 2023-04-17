
package queueusinglinkedlist;

public class List {
    Queue front = null;
    Queue rear = null;
    
    boolean isEmpty(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }
    }
    
    void Enqueue(int item){
        Queue temp = new Queue();
        temp.data=item;
        temp.next=null;
        
        if(front==null){
            front=temp;
            rear=front;
        }
        
        else{
            rear.next=temp;
            rear=temp;
        }
    }
    
    void Dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        else{
            front=front.next;
        }           
    }  
     public void Display(){
        Queue temp=front;
        while(temp!=null){
            System.out.println(temp.data);
           temp=temp.next;
        }
    }
}
