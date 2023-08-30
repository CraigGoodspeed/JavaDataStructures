package nz.co.goodspeed.practice;

public class RemoveNodeWhenRightIsGreater {

    public static void main(String[] args) {
        int[] data = new int[]{10,20,30,40,50,60};
        Node head = buildTree(data);
        Node res1 = compute(head);
        Node res2 = compute(buildTree(new int[]{12,15,10,11,5,6,2,3}));
        Node res3 = compute(buildTree(new int[]{9, 3, 2, 6, 7, 2, 4, 10, 1, 5,2,4,6,7,8,9,12}));
        System.out.println(head);
    }

    public static Node compute(Node head) {
        Node greatest = head;
        while(head != null) {
            if(greatest.data < head.data)
                greatest = head;
            head = head.next;
        }
        if(greatest.next != null)
            greatest.next = compute(greatest.next);
        return greatest;
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
