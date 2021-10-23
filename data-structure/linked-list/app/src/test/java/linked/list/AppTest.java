/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Test code challenge 05

    @Test void TestEmpty() {
        LinkedList emptyL = new LinkedList();
        String expected="";
        assertEquals(expected,emptyL.toString());
    }
    @Test void TestInsert() {
        LinkedList testing =new LinkedList();
        testing.insert("a");
        testing.insert("d");
        testing.insert("i");
        testing.insert("a");
        testing.insert("h");
        testing.insert("G");
        assertEquals("{G} -> {h} -> {a} -> {i} -> {d} -> {a} -> NULL",testing.toString());


    }

    @Test void headPoints() {
        LinkedList testing = new LinkedList();
        testing.insert("D");
        testing.insert("C");
        testing.insert("B");
        testing.insert("A");
//        String expected="";
        assertEquals("A",testing.head.getValue());
    }
    @Test void MultiNodeTest() {
        LinkedList testing = new LinkedList();
        testing.insert("2");
        testing.insert("4");
        testing.insert("6");
        testing.insert("8");
        testing.insert("10");
        assertEquals("{10} -> {8} -> {6} -> {4} -> {2} -> NULL",testing.toString());
    }

    @Test void includeTestTrue() {
        LinkedList testList = new LinkedList();
        testList.insert("1");
        testList.insert("2");
        testList.insert("3");
        testList.insert("4");
        testList.insert("5");
        assertTrue(testList.includes("5"));

    }

    @Test void includeTestFalse() {
        LinkedList testList = new LinkedList();
        testList.insert("1");
        testList.insert("2");
        testList.insert("3");
        testList.insert("4");
        testList.insert("5");
        assertFalse(testList.includes("6"));

    }
    @Test void collectionTestReturn() {
        LinkedList testList = new LinkedList();
        testList.insert("7");
        testList.insert("25");
        testList.insert("1");
        testList.insert("9");
        testList.insert("3");
        assertEquals("{3} -> {9} -> {1} -> {25} -> {7} -> NULL",testList.toString());
    }

    //Test code challenge 06

    @Test void testAppend (){
        LinkedList testing=new LinkedList();
        testing.append("A");
        testing.append("B");
        testing.append("C");
        testing.append("D");
        testing.append("E");

        assertEquals("{A} -> {B} -> {C} -> {D} -> {E} -> NULL",testing.toString());
    }

    @Test void addMultipleEndNodesTest(){
        LinkedList testing=new LinkedList();
        testing.append("100");
        testing.append("200");
        testing.append("300");
        testing.append("400");
        testing.append("500");
assertEquals("{100} -> {200} -> {300} -> {400} -> {500} -> NULL",testing.toString());


    }
    @Test void insertBeforeMiddle(){
        LinkedList testing=new LinkedList();
        testing.insert("5");
        testing.insert("4");
        testing.insert("3");
        testing.insert("2");
        testing.insert("1");
        testing.insertBefore("0","3");
        assertEquals("{1} -> {2} -> {0} -> {3} -> {4} -> {5} -> NULL",testing.toString());

    }
    @Test void insertAfterHead(){
        LinkedList testing=new LinkedList();
        testing.insert("5");
        testing.insert("4");
        testing.insert("3");
        testing.insert("2");
        testing.insert("1");
        testing.insertBefore("0","1");
        assertEquals("{0} -> {1} -> {2} -> {3} -> {4} -> {5} -> NULL",testing.toString());

    }

    @Test void insertAfterMiddle(){
        LinkedList testing=new LinkedList();
        testing.insert("5");
        testing.insert("4");
        testing.insert("3");
        testing.insert("2");
        testing.insert("1");
        testing.insertAfter("3","-1");
        assertEquals("{1} -> {2} -> {3} -> {-1} -> {4} -> {5} -> NULL",testing.toString());

    }

    @Test void insertAfterTail(){
        LinkedList testing=new LinkedList();
        testing.insert("5");
        testing.insert("4");
        testing.insert("3");
        testing.insert("2");
        testing.insert("1");
        testing.insertAfter("5","TailNode");
        assertEquals("{1} -> {2} -> {3} -> {4} -> {5} -> {TailNode} -> NULL",testing.toString());

    }

    //Test code challenge 06


    @Test void   kIsGreaterThanLength(){
        LinkedList testing=new LinkedList();
        testing.insert("5");
        testing.insert("4");
        testing.insert("3");
        testing.insert("2");
        assertEquals("Exception", testing.kthFromEnd(10));

    }
    @Test void KEqualListLength(){
        LinkedList testing=new LinkedList();

        testing.insert("5");
        testing.insert("4");
        testing.insert("3");
        testing.insert("2");
        assertEquals("Exception", testing.kthFromEnd(4));

    }
    @Test void KthValueNegative(){
        LinkedList testing=new LinkedList();

        testing.insert("5");
        testing.insert("4");
        testing.insert("3");
        testing.insert("2");
        assertEquals("Exception", testing.kthFromEnd(-1));

    }
    @Test
    public void size1() {
        LinkedList testing = new LinkedList();
        testing.insert("1");
        assertEquals("Exception", testing.kthFromEnd(1));
    }

   @Test public void happyPath() {
        LinkedList testing = new LinkedList();

        testing.insert("H");
        testing.insert("a");
        testing.insert("p");
        testing.insert("p");
        testing.insert("y");
        testing.insert(" ");
        testing.insert("P");
        testing.insert("a");
        testing.insert("t");
        testing.insert("h");

        assertEquals(" ", testing.kthFromEnd(5));
    }

    // test code challenge 08

     @Test void zipTest(){
        LinkedList linkedList1 = new LinkedList();
         linkedList1.insert("6");
         linkedList1.insert("4");
         linkedList1.insert("2");


        LinkedList linkedList2 = new LinkedList();
         linkedList2.insert("5");
         linkedList2.insert("3");
         linkedList2.insert("1");




        LinkedList testing =new LinkedList();
        String expected="{1} -> {2} -> {3} -> {4} -> {5} -> {6} -> NULL";
        assertEquals(expected,testing.zipLists(linkedList1,linkedList2));
    }

    @Test
    public void zipBothListEmpty(){

        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();


        assertNull(linkedList1.zipLists(linkedList1, linkedList2), "empty lists");

    }







}
