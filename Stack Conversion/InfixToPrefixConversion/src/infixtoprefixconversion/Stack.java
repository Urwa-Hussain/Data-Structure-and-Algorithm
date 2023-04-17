
package infixtoprefixconversion;

public class Stack {
    int top=-1;
    int size=100;
    String a[]= new String[size];
 
    void Push(String ch) {
        ++top;
        a[top] = ch;
        //cout<<stack[top];
    }

    String Pop(String c) {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return "";
        } 
        else {
            c = a[top];
            top = top - 1;
            return c;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } 
        else{
            return false;
        }
    }

    String Peek() {
        String c;
        c = a[top];
        return c;
    }
}
