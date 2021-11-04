package stackAndQueue2;

public class PseudoQueue {
    Stack firstStack = new Stack();
    Stack secStack = new Stack();

    public String enqueue(String value) {
        while (!secStack.isEmpty()) {
            firstStack.push(secStack.pop());
        }
        secStack.push(value);

        while (!firstStack.isEmpty()) {
            secStack.push(firstStack.pop());
        }
        return value;
    }

    public String dequeue() {
        if (secStack == null) {
            System.out.println("Stack is empty");
        }
        String value = secStack.peek();
        secStack.pop();
        return value;
    }


    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stack2=" + secStack +
                '}';

    }
}
