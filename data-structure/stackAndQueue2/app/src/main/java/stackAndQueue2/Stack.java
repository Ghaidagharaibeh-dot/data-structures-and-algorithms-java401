package stackAndQueue2;

public class Stack {
    private Node top;


    public void push(String data) {
        if (isEmpty()) {
            top = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.setNext(top);
            top = newNode;
        }


    }


    public String pop() {
        if (isEmpty()) {
            return "The Stack Is Empty";
        } else {
            String data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public String peek() {
        if (isEmpty()) {
            return "The Stack Is Empty";
        } else {
            return top.getData();
        }

    }


    public boolean isEmpty() {
        return top == null;
    }

    public Node getTop() {
        return top;
    }

    @Override
    public String toString() {
        if (top == null) {
            return "The List is empty";
        } else {
            String outPut = "";
            Node node = top;
            while (node != null) {
                outPut += "{" + node.getData() + "}" + " -> ";
                node = node.getNext();
            }
            outPut += "{Null}";
            return outPut;
        }
    }
}
