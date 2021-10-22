package linked.list;

import java.util.Objects;

public class LinkedList {
    Node head;
     int size =0;

    public int getSize() {
        return size;
    }




    public void insert(String value) {

//         Node newNode = new Node(value);
        if (head==null){
            Node newNode = new Node(value);
            head = newNode;
            size++;
        }
        else {
            Node newNode = new Node(value);

            newNode.next=head;
           head=newNode;
           size++;

        }
    }


    public boolean includes(String value) {

        Node current = new Node(value);
        if (size == 0){
            current = head;
        }else {
            while (current != null){
                if(Objects.equals(current.getValue(), value)){
                    return true;
                }
                current =current.getNext();
            }
        }

        return false;

    }

    public void append(String value) {
        Node newNode = new Node(value);

        if (head != null){
            Node currentNode=head;
            while (currentNode.next != null){
                currentNode=currentNode.next;
            }
            currentNode.next =newNode;
            size++;

        }
        else {
            head = newNode;
            size++;
        }

    }
    public void insertBefore(String newValue, String currentValue) {

        Node newNode = new Node(newValue);
        Node current = head;
        Node previous =null;
        if(head.getValue() == currentValue){
            newNode.setNext(head);
            head=newNode;
            return;
        }
        while (current != null){
            if(current.getValue() == currentValue){
                newNode.setNext(current);
                previous.setNext(newNode);
                break;
            }
            else {
                previous=current;
                current=current.getNext();
            }
        }


    }


    public void insertAfter(String reference, String value) {

        Node temp = new Node(value);
        Node current = head;
        while ( current != null){
            if (current.getValue().equals(reference)) {

                temp.setNext(current.getNext());
                current.setNext(temp);
                break;
            } else {
                current = current.getNext();
            }
        }
    }

//
//    public void insertAfter(String  reference , String value){
//        Node current =head;
//        while (current!= null){
//            if(current.value == reference){
//                Node newNode= new Node(value);
//                newNode.next=current.next;
//                current.next=newNode;
//                break;
//            }
//            current=current.next;
//        }
//        if(current==null){
//            insert(value);
//        }
//    }
//
//    public String kthFromEnd(int kth) {
//        Node current=head;
//        if(head==null){
//            System.out.println("empty list");
//        }
//        if ( kth > getSize()-1 || kth<0 ){
//            return  "Exception";
//        }
//        int initalValue=0;
//        while (initalValue <(getSize()-kth-1)){
//            current=current.getNext();
//            initalValue++;
//        }
//return current.getValue();
//        }
//
//    }

@Override
    public String toString() {
        String result = "";
        if (head == null) {
            System.out.println("Empty List ");

        }
        else {
            Node current = head;
            while (current != null) {
                result = result + "{" + current.getValue() + "}" + " -> " ;
                current = current.getNext();
            }
            result =result+"NULL";

        }
        return result;

    }

    }
