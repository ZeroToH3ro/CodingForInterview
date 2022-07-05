package Progress.DataStructure;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList_HCK {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    // algorithm
    // Time: 0(N) , Space 0(1)
    // step 1: current node -> next = next node - > next
    // step 2: next node -> next = head
    // step 3: next node = head node
    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        while (curNode != null && curNode.next != null) {
            //define next node
            ListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }   

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        printLinkedList(a1);
        ListNode newList = reverseList(a1);
        printLinkedList(newList);
    }
}
