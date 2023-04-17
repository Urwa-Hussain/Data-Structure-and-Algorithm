package binarysearchtree;
import java.util.Scanner;

public class BinarySearchTree {

    Node root;

    void insert(int key) {
        root = insertIntoBST(root, key);
    }

    Node insertIntoBST(Node root, int d) {
        // Base case
        if (root == null) {
            root = new Node(d);
            return root;
        }
        if (d > root.data) {
            root.right = insertIntoBST(root.right, d);
        } else if (d < root.data) {
            root.left = insertIntoBST(root.left, d);
        }
        if (root.data == d) {
            System.out.println("Duplicate Value cant exist");

        }
        return root;
    }
//    void inorder(Node root){
//	if(root==null){
//		return;
//	}
//	inorder(root.left);
//	System.out.println(root.data);
//	inorder(root.right);
//}

    void inorder() {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    boolean search(int key) {
        root = search_Recursive(root, key);
        if (root != null) {
            return true;
        } else {
            return false;
        }
    }

    //recursive insert function
    Node search_Recursive(Node root, int key) {
        // Base Cases: root is null or key is present at root 
        if (root == null || root.data == key) {
            return root;
        }
        // val is greater than root's key 
        if (root.data > key) {
            return search_Recursive(root.left, key);
        }
//        As a root pass ho raha hai root.left
        // val is less than root's key 
        return search_Recursive(root.right, key);
    }

    void deleteKey(int key) {
        root = deleterec(root, key);
    }

    public Node deleterec(Node root, int data) {
//        Empty tree
        if (root == null) {
            return null;
        } else if (data < root.data) {
            root.left = deleterec(root.left, data);
        } else if (data > root.data) {
            root.right = deleterec(root.right, data);
        } else {
            // node with only one child or no child            
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = successor(root.right);
            // Delete the inorder successor
            root.right = deleterec(root.right, root.data);
        }

        return root;
    }

    int successor(Node root) {
        int succ = root.data;
        while (root.left != null) {
            succ = root.left.data;
            root = root.left;
        }
        return succ;
    }

    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        BinarySearchTree b = new BinarySearchTree();
        b.insert(50);
        b.insert(30);
        b.insert(20);
        b.insert(40);
        b.insert(70);
        b.insert(60);
        b.insert(80);
        System.out.println("Printing the BST");
        b.inorder();
        System.out.println("Enter the value to be deleted");
//        int data = sc.nextInt();
//        boolean ret_value = b.search(data);
//        if (ret_value == true) {
//            System.out.println("Found " + data);
//        } else {
//            System.out.println("Not found " + data);
//        }
        int c = sc.nextInt();
        b.deleteKey(c);
        b.inorder();
    }

}
