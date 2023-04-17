package treecreation;
import java.util.Scanner;
public class Tree {

    Node BuildTree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data for node: ");
        int d = scanner.nextInt();

        if (d == -1) {
            return null;
        }
        Node root = new Node();
        root.data = d;
        root.left = BuildTree();
        root.right = BuildTree();
        return root;

    }

    void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }

    void PostOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        PostOrder(root.left);
        PostOrder(root.right);
    }

    void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }
}
