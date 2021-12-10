package hashTableDataStructure.binaryTree;

public class Node<T> {
    private final int key;
    private Node <T> left;
    private Node <T> right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }

    public int getKey() {
        return key;
    }

    public Node <T> getLeft() {
        return left;
    }

    public void setLeft(Node <T> left) {
        this.left = left;
    }

    public Node <T> getRight() {
        return right;
    }

    public void setRight(Node <T> right) {
        this.right = right;
    }

}
