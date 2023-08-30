package nz.co.goodspeed.practice;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node node) {
        this.next = node;
        return this.next;
    }

    public static Node buildTree(int[] data) {
        if(data.length == 0)
            return null;
        Node head = new Node(data[0]);
        Node tmp = head;
        for(int i = 1; i < data.length; i++) {
            tmp.setNext(new Node(data[i]));
            tmp = tmp.next;
        }
        return head;
    }
}
