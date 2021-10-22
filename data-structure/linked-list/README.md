# Linked List
Nodes that are connected to each other which mean Node references the next Node.

# Challenge
 
- A Node class that has properties for the value stored in the Node,
and a pointer to the next Node.
- Insert method to add a new node at the beginning of the LinkedList.
- Includes method to ensure that liked list have specific nods value Indicates 
- create  toString  methods takes  no arguments and returns a string representing all the values in the Linked List


# Approach & Efficiency 

- Insert
define new node if head is null the new node equal head otherwise the next of new node equal the head of likedlist and the new node id head
-Includes
loop throw the linked list then ensure if the node is exist through build in methods Objects.equals

-toString: Returns a string containing all the values of the nodes of the linked list.