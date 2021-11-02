package trees;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {
    protected Node<T> root;


    private void preOrderHelper(Node<T> rootvalue, List<T> list) {

        list.add(rootvalue.getData());

        if (rootvalue.getLeftNode() != null) {
            preOrderHelper(rootvalue.getLeftNode(), list);
        }

        if (rootvalue.getRightNode() != null) {
            preOrderHelper(rootvalue.getRightNode(), list);
        }
    }

    public List<T> preOrder(){
        if (isEmpty()){
            return null;
        }
        List<T> list = new ArrayList<>();
        preOrderHelper(root, list);
        return list;
    }

    private void inOrderHelper(Node<T> rootArg, List<T> list) {

        if (rootArg.getLeftNode() != null) {
            inOrderHelper(rootArg.getLeftNode(), list);
        }

        list.add(rootArg.getData());

        if (rootArg.getRightNode() != null) {
            inOrderHelper(rootArg.getRightNode(), list);
        }
    }

    public List<T> inOrder() {
        if (isEmpty()) {
            return null;
        }
        List<T> list = new ArrayList<>();
        inOrderHelper(root, list);
        return list;
    }

    private void postOrderHelper(Node<T> rootvalue, List<T> list) {


        if (rootvalue.getLeftNode() != null) {
            postOrderHelper(rootvalue.getLeftNode(), list);
        }

        if (rootvalue.getRightNode() != null) {
            postOrderHelper(rootvalue.getRightNode(), list);
        }

        list.add(rootvalue.getData());
    }

    public List<T> postOrder() {
        if (isEmpty()) {
            return null;
        }
        List<T> list = new ArrayList<>();
        postOrderHelper(root, list);
        return list;
    }


    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "BinaryTree { " +
                "root=" + root +
                " }";
    }


    // code challange 16
    public int max(){
        if(isEmpty()){
            return 0;
        }
        int maximumV=0;
        List<T> list = preOrder();
        for (int i=0;i<list.size();i++){
            if(Integer.parseInt(list.get(i)+"")>maximumV){
                maximumV=Integer.parseInt(list.get(i)+"");
            }
        }
        return maximumV;
    }

    // code Challenge 17
//    public List<T> treeBreadthFirst(BinaryTree<T> binaryTree){
//        if(isEmpty()){
//            return null;
//        }
//        ArrayList<T> list= new ArrayList<>() ;
//        Queue<Node<T>> tree=new LinkedList<>();
//        Node<T> newNode=binaryTree.root;
//        tree.add(newNode);
//        while (!tree.isEmpty()){
//            if(tree.peek().getLeftNode() != null){
//                tree.add(tree.peek().getLeftNode());
//
//            }
//            if (tree.peek().getRightNode() != null){
//                tree.add(tree.peek().getRightNode());
//            }
//            list.add(tree.remove().getData());
//        }
//        return list;
//    }

}



