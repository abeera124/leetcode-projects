class MyStack {

    // Node class for linked list
    private class Node {
        int val;
        Node next;
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node topNode;

    public MyStack() {
        topNode = null;
    }

    // Push element onto stack
    public void push(int x) {
        topNode = new Node(x, topNode);
    }

    // Remove the element on top of stack and return it
    public int pop() {
        int val = topNode.val;
        topNode = topNode.next;
        return val;
    }

    // Get the top element
    public int top() {
        return topNode.val;
    }

    // Return whether the stack is empty
    public boolean empty() {
        return topNode == null;
    }
}
