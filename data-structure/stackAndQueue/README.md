# Stacks and Queues

## Challenge 11
 ### A stack
Is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not reference its previous.
### A Queue 
The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept

## Approach & Efficiency
- Create  classes for the Node ,Stack,Queue .
- using the methodology of the stacks and queues in creating corresponding methods and basically getnext and setnext methods.
- Space: O(1)
- Time: O(1)

## API
 Stack's Methods
- push() to add new node in the stack.

- pop() to Remove the node from the top of the stack.

- peek() to Returns Value of the node located at the top of the stack.

- isEmpty()  Boolean indicating whether or not the stack is empty.

 Queue's Methods
 - enqueue(int value) to add new node in the queue.

 - dequeue() to Removes the node from the front of the queue.

 - peek() to Returns Value of the node located at the front of the queue.

 - isEmpty()  Boolean indicating whether or not the queue is empty.