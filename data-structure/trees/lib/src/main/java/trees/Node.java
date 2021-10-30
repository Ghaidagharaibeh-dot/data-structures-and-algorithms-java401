package trees;

public class Node<T> {

    private T data;
    private Node<T> rightNode;
    private Node<T> leftNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", rightNode=" + rightNode +
                ", leftNode=" + leftNode +
                '}';
    }
}
