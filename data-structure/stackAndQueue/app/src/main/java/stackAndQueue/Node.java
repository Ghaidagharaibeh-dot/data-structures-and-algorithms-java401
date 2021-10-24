package stackAndQueue;

public class Node {
    private Node next;
    private String data;


    public Node(String data){
        this.data=data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next=next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data='" + data + '\'' +
                '}';
    }
}
