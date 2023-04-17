
package infixtopostfixconversion;

public class Functions extends Operators {
     static int precedence(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    String InfixToPostfix(String infix) {
        Operators operators = new Operators();
        char ch;
        String postfix = "";
        char c = 0;

        for (int i = 0; i < infix.length(); ++i) {
            ch = infix.charAt(i);
            
            if (Character.isLetter(ch)||Character.isDigit(ch)) {
                postfix = postfix + ch;
            } else if (ch == '(') {
                operators.Push(ch);
            } else if (ch == ')') {
                while (operators.Peek() != '(') {
                    postfix = postfix + operators.Pop(c);
                }
                operators.Pop(c);
            } else {
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.Peek())) {
                    postfix = postfix + operators.Pop(c);
                }
                operators.Push(ch);
            }
        }

        while (!operators.isEmpty()) {
            postfix = postfix + operators.Pop(c);
        }
        return postfix;
    }
}
