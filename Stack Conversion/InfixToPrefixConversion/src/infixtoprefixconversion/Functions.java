package infixtoprefixconversion;

public class Functions extends Operator {

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
        char symbol;
        String postfix = "";
        char c = 0;

        for (int i = 0; i < infix.length(); ++i) {
            symbol = infix.charAt(i);

            if (Character.isLetter(symbol)) {
                postfix = postfix + symbol;
            } else if (symbol == ')') {
                operators.Push(symbol);
            } else if (symbol == '(') {
                while (operators.Peek() != ')') {
                    postfix = postfix + operators.Pop(c);
                }
                operators.Pop(c);
            } else {
                while (!operators.isEmpty() && precedence(symbol) <= precedence(operators.Peek())) {
                    postfix = postfix + operators.Pop(c);
                }
                operators.Push(symbol);
            }
        }

        while (!operators.isEmpty()) {
            postfix = postfix + operators.Pop(c);
        }
        return postfix;
    }

    String InfixToPrefix(String infix) {
        String prefix = "";
        String reverseString = "";
        
        for (int i = infix.length() - 1; i >= 0; i--) {
            reverseString = reverseString + infix.charAt(i);
        }

        String reversePostfix = InfixToPostfix(reverseString);
        for (int i = reversePostfix.length() - 1; i >= 0; i--) {
            prefix = prefix + reversePostfix.charAt(i);
        }
        return prefix;
    }
}