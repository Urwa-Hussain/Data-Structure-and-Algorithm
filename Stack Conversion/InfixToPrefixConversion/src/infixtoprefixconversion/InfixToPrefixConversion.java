package infixtoprefixconversion;

import java.util.Scanner;
public class InfixToPrefixConversion {

    public static void main(String[] args) {
        Functions functions = new Functions();
        Scanner scanner = new Scanner(System.in);
        String expression;
        System.out.println("Enter the Expression: ");
        expression = scanner.nextLine();
        System.out.println("Postfix: " + functions.InfixToPrefix(expression));
    }
}


