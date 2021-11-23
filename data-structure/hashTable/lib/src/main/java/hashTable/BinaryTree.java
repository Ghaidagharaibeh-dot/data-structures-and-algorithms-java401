package hashTable;

import java.util.ArrayList;
import java.util.List;

class Node<T> {
    public T value;
    public Node<T> leftChild;
    public Node<T> rightChild;
    public Node<T> next;
    public List<Node> child = new ArrayList<>();

    public Node() {

    }

    public Node(T value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Node(T value, Node<T> leftChild, Node<T> rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}


public class BinaryTree <T>{
    public BinaryTree() {}

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    ArrayList<T> preOrderList = new ArrayList<>();
    Node<T> root;
    public ArrayList<T> preOrder(Node<T> root) {
        try {
            if (root != null) {
                preOrderList.add(root.value);
                preOrder(root.leftChild);
                preOrder(root.rightChild);
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
        return preOrderList;
    }

    public void travers(Node node, List leafValues) {
        if (node != null) {
            if (node.leftChild == null && node.rightChild == null)
                leafValues.add(node.value);
            travers(node.leftChild, leafValues);
            travers(node.rightChild, leafValues);
        }
    }

    @Override
    public String toString() {
        if (preOrderList.isEmpty()) return "empty tree lists";
        else return "BinaryTree{" +
                ", preOrderList=" + preOrderList;
    }
}
