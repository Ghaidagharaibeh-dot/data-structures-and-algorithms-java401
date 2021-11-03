package trees;

import java.util.LinkedList;
import java.util.Queue;

public class KaryTree<T> {


    KaryTreeNode<T> root=null;
    int nodes = 0;
    int K=0;


    public KaryTree(int k) {
        if(k<=1)
            k=2;
        this.K = k;
    }

    public boolean isEmpty() {

        return root == null;
    }

    public void add(T value){
        nodes++;
        KaryTreeNode<T> newNode = new KaryTreeNode<T>(value);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<KaryTreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            KaryTreeNode<T> currentNode = queue.poll();
            if(currentNode.list.size() < this.K){
                currentNode.addChild(newNode);
                return;
            }
            else {
                queue.addAll(currentNode.list);
            }
        }
    }

    /**
     *  Code Challenge 18
     */


    public  KaryTree<String> fizzBuzzTree(KaryTree<Integer> kTree){
        KaryTree<String> outTree = new KaryTree<>(kTree.K);

        Queue<KaryTreeNode<Integer>> queue = new LinkedList<>();
        if(!kTree.isEmpty()){
            queue.add(kTree.root);

            while(!queue.isEmpty()){

                KaryTreeNode<Integer> currentNode = queue.poll();

                String currentValue;
                if(currentNode.value % 3 == 0 && currentNode.value % 5 == 0 )
                    currentValue = "FizzBuzz";
                else if((int)currentNode.value % 3 == 0)
                    currentValue = "Fizz";
                else if((int)currentNode.value % 5 == 0)
                    currentValue = "Buzz";
                else
                    currentValue = currentNode.value.toString();

                outTree.add(currentValue);

                if(!currentNode.list.isEmpty())
                    queue.addAll(currentNode.list);
            }
        }
        return outTree;
    }


    @Override
    public String toString() {
        return '{'+
                " "+ root +
                '}';
    }

}
