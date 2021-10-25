package stackAndQueue;

public class pseudoQueue {
    Stack firstStack = new Stack();
    Stack secStack = new Stack();

    public void enqueue(String value){
        firstStack.push(value);
    }

    public String dequeue() {
          while (firstStack.getTop() != null){
              secStack.push(firstStack.pop());
          }
        String data=secStack.pop();

        while (secStack.getTop() != null){
            firstStack.push(secStack.pop());
        }

        return data;

    }

    @Override
    public String toString() {
        return "pseudoQueue{" +
                "firstStack=" + firstStack +
                ", secStack=" + secStack +
                '}';
    }
}



