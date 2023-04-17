package infixtopostfixconversion;
import java.util.Scanner;
public class InfixToPostfixConversion {

    public static void main(String[] args) {
        Functions functions = new Functions();
        Scanner scanner = new Scanner(System.in);
        String infix;
        System.out.println("Enter the Expression: ");
        infix = scanner.nextLine();
        System.out.println("Postfix: " + functions.InfixToPostfix(infix));
    }
    
}
