
package treecreation;

public class TreeCreation {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.BuildTree();
        System.out.println("Inorder of given binary tree is: ");
        tree.InOrder(root);
        System.out.println("PostOrder of given binary tree is: ");
        tree.PreOrder(root);
        System.out.println("Preorder of given binary tree is: ");
        tree.PostOrder(root);
    }
}
