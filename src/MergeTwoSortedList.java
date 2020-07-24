import java.util.LinkedList;
import java.util.List;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class MergeTwoSortedList {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }

    public  Node mergeTwoSortedList(Node l1, Node l2) {
        Node prehead = new Node(-1);
        Node prev = prehead;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;

        }
        prev.next = l1 == null ? l2 : l1;
        return prehead;
    }


    public static void main(String[] args) {

        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        Node l1 = new Node(1);
        l1.next = new Node(5);
        Node l2 = new Node(0);
        l2.next = new Node(4);

        Node head = mergeTwoSortedList.mergeTwoSortedList(l1,l2);
        printList(head);

    }


}

