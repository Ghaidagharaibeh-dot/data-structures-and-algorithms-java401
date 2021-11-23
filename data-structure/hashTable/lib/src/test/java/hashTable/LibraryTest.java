/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void firstRepeatedWord() throws Exception{
        HashTable hashMap= new HashTable(7);
        assertEquals("hope,", hashMap.repeatedWord("It was the bestof foolishness, spring of hope,"));

}


    @Test
    void testTreeIntersection() {
        BinaryTree<Integer> tree1 = new BinaryTree<>();
        BinaryTree<Integer> tree2 = new BinaryTree<>();



        assertNull(Library.treeIntersection(tree1, tree2));
        tree1.root = new Node<>(5);
        assertNull(Library.treeIntersection(tree1, tree2));

        tree1 = new BinaryTree<>();
        tree2 = new BinaryTree<>();
        Node<Integer> item6 = new Node<>(30);
        Node<Integer> item5 = new Node<>(27);
        Node<Integer> item4 = new Node<>(2);
        Node<Integer> item3 = new Node<>(11, item6, null);
        Node<Integer> item2 = new Node<>(15, item5, null);
        Node<Integer> item1 = new Node<>(3, item3, item4);
        Node<Integer> root1 = new Node<>(20, item1, item2);
        tree1.root = root1;

        Node<Integer> item12 = new Node<>(31);
        Node<Integer> item11 = new Node<>(29);
        Node<Integer> item10 = new Node<>(1);
        Node<Integer> item9 = new Node<>(10, item12, null);
        Node<Integer> item8 = new Node<>(16, item11, null);
        Node<Integer> item7 = new Node<>(4, item9, item10);
        Node<Integer> root2 = new Node<>(19, item7, item8);
        tree2.root = root2;

        ArrayList<Integer> test = Library.treeIntersection(tree1, tree2);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, test);



    }

}
