package binarysearchtree;

public class Node {

    int data;
    Node right;
    Node left;

    Node() {
        right = null;
        left = null;
    }

    Node(int d) {
        this.data = d;
        right = null;
        left = null;
    }
}
