
package infixtopostfixconversion;

class Operators {
    int top=-1;
    int size=100;
    char a[]= new char[size];
 
    void Push(char ch) {
        ++top;
        a[top] = ch;
    }

    char Pop(char c) {
        if (isEmpty()) {
            System.out.println("Empty");
            return 0;
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

    char Peek() {
        char c;
        c = a[top];
        return c;
    }
}
