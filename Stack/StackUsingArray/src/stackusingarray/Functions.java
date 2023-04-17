
package stackusingarray;

public class Functions {
    int top = -1;
    int size = 100;
    int arr[]= new int[size];
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull(){
        if (top == size-1){
            return true;
        }
        else
            return false;
    }
    
    public void Push(int item){
        if(isFull()){
            System.out.println("Full");
        }
        else{
            arr[++top]= item;
        }
    }
    
    public void Pop(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        else{
            top=--top;
        }
    }
    
    void Peek(){
        System.out.println(arr[top]);
    }
    
    void Display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
