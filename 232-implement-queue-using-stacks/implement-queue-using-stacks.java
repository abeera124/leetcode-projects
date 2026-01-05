class MyQueue {

    // Node class for stack
    private class Node {
        int val;
        Node next;
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node input;   // Stack for push
    private Node output;  // Stack for pop/peek

    public MyQueue() {
        input = null;
        output = null;
    }

    // Push element to the back of queue
    public void push(int x) {
        input = new Node(x, input);
    }

    // Removes the element from in front of queue and returns it
    public int pop() {
        moveInputToOutput();
        int val = output.val;
        output = output.next;
        return val;
    }

    // Get the front element
    public int peek() {
        moveInputToOutput();
        return output.val;
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return input == null && output == null;
    }

    // Move elements from input stack to output stack if output is empty
    private void moveInputToOutput() {
        if (output == null) {
            while (input != null) {
                Node next = input.next;
                input.next = output;
                output = input;
                input = next;
            }
        }
    }
}
