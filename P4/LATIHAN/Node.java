package P4.LATIHAN;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node GetNext() {
        return this.next;
    }

    public void SetNext(Node next) {
        this.next = next;
    }

    public int GetData() {
        return this.data;
    }
}

