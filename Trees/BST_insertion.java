package Trees;

import java.util.*;

public class BST_insertion {
    Node root;
    static Scanner s = new Scanner(System.in);

    class Node {
        Node root;
        int value;
        Node left;
        Node right;

        Node(int val) {
            value = val;
            left = right = null;
        }
    }

    public boolean Insert() {
        
        int val = s.nextInt();
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value)
                return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    void Preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");

        Preorder(node.left);
        Preorder(node.right);
    }

    void Inorder(Node node) {
        if (node == null) {
            return;
        }
        Inorder(node.left);
        System.out.print(node.value + " ");
        Inorder(node.right);
    }

    void PostOrder(Node node) {
        if (node == null) {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(+node.value + " ");
    }

    // checking node is present or not //
    public String contains(int value ) {
        if (root == null)
            return "Not Found";
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return "Node Found";
            }
        }
        return "Not found";
    }

    // Counting number of Node present in BST : //

         void height() {
            System.out.println("ENTER THE NUMBER OF NODE :");
          int height = s.nextInt();
        height = height + 1;
        for (int i = 1; i <= height; i++) {
             Insert();
        }
    }

    public static void main(String[] args) {
        BST_insertion t = new BST_insertion();
        t.height();
        // t.Insert();
        // t.Insert();
        // t.Insert();
        // t.Insert();
        // t.Insert(80);
        // t.Insert(45);
        // t.Insert(78);
        // t.Insert(40);
        // t.Insert(12);
        // t.Insert(30);
        // t.Insert(90);
        System.out.println("Root : " + t.root.value);
        System.out.print(" Preorder Traversal Result : ");
        t.Preorder(t.root);
        System.out.print("\n Inorder Traversal Result  : ");
        t.Inorder(t.root);
        System.out.print("\nPostOrder Traversal Result : ");
        t.PostOrder(t.root);
        System.out.println("\nEnter the Node value : ");
        int value = s.nextInt();
        System.out.println("Node Found : " + t.contains(value));
        System.out.println();
        }

}
