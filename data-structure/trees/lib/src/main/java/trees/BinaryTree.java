package trees;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    public Node<T> root;


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

}



