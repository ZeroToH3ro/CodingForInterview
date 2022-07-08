package Progress.DataStructure;

public class MergeTwoSortedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp_node = new ListNode(0);
        ListNode currentNode = temp_node;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        if(l1 != null) {
            currentNode.next = l1;
            l1 = l1.next;
        }
        if(l2 != null) {
            currentNode.next = l2;
            l2 = l2.next;
        }
        return temp_node.next;
    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(6);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        System.out.println(mergeTwoLists(a1,a2));
    }
}
