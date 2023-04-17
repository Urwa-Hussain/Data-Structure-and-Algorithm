
package stackusingarray;

public class StackUsingArray {

    public static void main(String[] args) {
         Functions stack = new Functions();
        stack.isEmpty();
        stack.isFull();
//        System.out.println("The pushed values are: ");
        stack.Push(50);
        stack.Push(100);
        stack.Push(150);
        stack.Push(250);
//        System.out.println("The Peek value is: ");
        stack.Pop();
     //   stack.Peek();
        stack.Display();
    }
    
}
