package nz.co.goodspeed.practice;

public class RemoveDuplicateLinkedList {
    public static void main(String[] args) {
        Node test = buildFirstTest();
        System.out.println(test.data);
        Node tmp = removeDuplicates(test);
        System.out.println("zaza");

    }

    public static Node removeDuplicates(Node head) {
        int current = head.data;
        Node toReturn = new Node(current);
        while((head = head.next) != null) {
            if(current == head.data || (toReturn.next != null && toReturn.next.data > current))
                continue;
            toReturn.next = removeDuplicates(head);
        }
        return toReturn;
    }

    public static Node buildTree(Integer[] items) {
        Node bottom = null;
        for(int i = items.length - 1; i >= 0;i--) {
            bottom = buildItems(items[i], bottom);
        }
        return bottom;
    }

    public static Node buildItems(int myVal, Node next) {
        Node toReturn = new Node(myVal);
        toReturn.next = next;
        return toReturn;
    }


    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private static Node buildFirstTest() {
        Integer[] items = new Integer[]{3, 12, 16, 22, 23, 24, 27, 27, 28, 30, 30, 31, 36, 36, 37, 41, 50, 59, 60, 63, 63, 64, 68, 68, 69, 73, 78, 83, 87, 87, 91, 93, 94};
        //Integer[] items = new Integer[]{2,2,4,5};
        return buildTree(items);
    }
}
