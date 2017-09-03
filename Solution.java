import java.util.*;

public class Solution { 
    private static class Node {
        int data;
        Node left;
        Node right;

        public Node (int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

        // An example of a BST tree
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        d.left = b;
        d.right = f;
        b.left = a;
        b.right = c;
        f.left = e;
        f.right = g;
        System.out.println(checkBST(d));
    }

    // Returns true if the tree is a BST
    private static boolean checkBST(Node root) {
        ArrayList<Integer> nodes = new ArrayList<Integer>();
        inOrder(root, nodes);
        return orderedArray(nodes);
    }

    // Fills an ArrayList with the nodes in in-order
    private static void inOrder(Node root, ArrayList<Integer> nodes) {
        if (root.left != null) {
            inOrder(root.left, nodes);
        }
        nodes.add(root.data);
        if (root.right != null) {
            inOrder(root.right, nodes);
        }
    }

    // Compares pairs of integers in an ArrayList
    private static boolean orderedArray(ArrayList<Integer> nodes) {
        int limit = nodes.size() - 1;
        for (int i = 0; i < limit; i++) {
            if (nodes.get(i) >= nodes.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
