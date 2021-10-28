package stackAndQueue;

public class Queue {
    private int size=0;


    private Node first;
    private Node last;

    public void enqueue(String data){
        if(isEmpty()){
            Node newNode= new Node(data);
            first=newNode;
            last=newNode;

        }else {
            Node newNode= new Node(data);
            last.setNext(newNode);
            last=newNode;

        }
    }

    public String dequeue(){
        if (isEmpty()) {
            return "The Queue Is Empty";
        } else {
            String value=first.getData();
            first=first.getNext();
            return  value;

        }
    }
    public String peek(){
        return first.getData();
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "The List is empty";
        } else {
            String outPut = "";
            Node node = first;
            while (node != null) {
                outPut += "{" + node.getData() + "}" + " -> ";
                node = node.getNext();
            }
            outPut += "{Null}";
            return outPut;
        }
    }
}
