package Progress.DataStructure;

public class RemoveElementsLinkedListLeetCode {
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
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode nextNode = head;
        while(nextNode != null) {
            if(nextNode.val == val) {
                cur.next = nextNode.next;
            } else {
                cur = cur.next;
            }
            nextNode = nextNode.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(7);
        ListNode a2 = new ListNode(7);
        ListNode a3 = new ListNode(7);
        ListNode a4 = new ListNode(7);
        ListNode a5 = new ListNode(7);
        ListNode a6 = new ListNode(7);
        ListNode a7 = new ListNode(7);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        ListNode newList = removeElements(a1, 7);
        printLinkedList(newList);
    }
}
