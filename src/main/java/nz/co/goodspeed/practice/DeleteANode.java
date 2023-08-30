package nz.co.goodspeed.practice;

public class DeleteANode {

    public static void main(String[] args) {
        Node res = deleteNode(Node.buildTree(new int[]{1,3,4}), 3);//expects 1-> 3
        Node res1 = deleteNode(Node.buildTree(new int[]{1,5,2,9}), 2);//expects 1->2->9
        Node res2 = deleteNode(Node.buildTree(new int[]{1}), 1);//expects empty
        Node res3 = deleteNode(Node.buildTree(new int[]{7,9}), 1);//expects 9

    }

    public static Node deleteNode(Node head, int x) {
        if(x == 1)
            return head.next;
        int count = 1;
        Node looper = head;
        while(count < (x - 1)) {
            count++;
            looper = looper.next;
        }

        //this node needs to be deleted.
        if(looper.next != null)
            looper.next = looper.next.next;

        return head;
    }
}
