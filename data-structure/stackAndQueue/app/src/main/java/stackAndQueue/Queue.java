package stackAndQueue;

public class Queue {
    private int size=0;


    private Node first;
    private Node last;

    public void enqueue(String data){
        if(ifEmpty()){
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
        if (ifEmpty()) {
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

    public boolean ifEmpty() {
        return first == null;
    }
}
