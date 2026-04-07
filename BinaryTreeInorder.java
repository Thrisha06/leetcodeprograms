class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeInorder {

    // Inorder traversal
    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);        // Left
        System.out.print(root.data + " "); // Root
        inorder(root.right);       // Right
    }

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        System.out.print("Inorder Traversal: ");
        inorder(root);
    }
}