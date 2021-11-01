package trees;

public class BinarySearchTree <T extends Comparable<T>> extends BinaryTree<T>{


    private boolean validator;

    public void add (T data){
        if(isEmpty()){
            root =new Node<>(data);
        }else
        {
            insertHelper(data,root);

        }
    }

    public void insertHelper (T data ,Node<T>root){
            Node<T> binaryTree =new Node<>(data);

        if (data.compareTo(root.getData()) < 0) {

            if (root.getLeftNode() == null)
                root.setLeftNode(binaryTree);
            else
                insertHelper(data, root.getLeftNode());

        }

        if (data.compareTo(root.getData()) > 0) {

            if (root.getRightNode() == null)
                root.setRightNode(binaryTree);
            else
                insertHelper(data, root.getRightNode());

        }


    }

    public boolean contains(T data) {
        validator = false;
        containsHelper(data, root);
        return validator;
    }

    private void containsHelper(T input, Node<T> node) {

        if (node.getData() == input) {
            validator = true;
        }
        if (node.getLeftNode() != null) {
            containsHelper(input, node.getLeftNode());
        }

        if (node.getRightNode() != null) {
            containsHelper(input, node.getRightNode());
        }

    }
    public Node<T> getRoot() {
        return root;
    }
    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }




}
