package prefixtoinfixconversion;

public class Functions extends Operators {
    String PostfixToInfix(String postfix) {
        Operators operators = new Operators();
        int j = postfix.length() - 1;
        String c = null;

        for (int i = 0; i <= j; i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetter(postfix.charAt(i))) {
                operators.Push(ch + "");
            } else {
                String operand1 = operators.Pop(c);
                String operand2 = operators.Pop(c);
                operators.Push("(" + operand2 + "" + ch + "" + operand1 + ")");
            }
        }
        return operators.Pop(c);
    }

    String PrefixToInfix(String prefix) {
        String infix = "";
        String reverseString = "";
        for (int i = prefix.length() - 1; i >= 0; i--) {
            reverseString = reverseString + prefix.charAt(i);
        }
            String reversePostfix = PostfixToInfix(reverseString);
        for (int i = reversePostfix.length() - 1; i >= 0; i--) {
            char c = reversePostfix.charAt(i);
            if (c == '(') {
                c = ')';
            } else if (c == ')') {
                c = '(';
            }
            infix = infix + c;
        }
        return infix;
    }
}
