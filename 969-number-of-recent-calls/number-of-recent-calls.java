class RecentCounter {

    // Node class for linked list
    private class Node {
        int val;
        Node next;
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head; // front of queue
    private Node tail; // end of queue

    public RecentCounter() {
        head = null;
        tail = null;
    }

    public int ping(int t) {
        // Add new request to the end
        Node newNode = new Node(t, null);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }

        // Remove all requests older than t - 3000
        while (head != null && head.val < t - 3000) {
            head = head.next;
        }

        // Count is the number of nodes in queue
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }
}
