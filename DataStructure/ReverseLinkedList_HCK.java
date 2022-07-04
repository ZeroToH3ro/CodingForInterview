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
    
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode curNode = null;
        while(curNode != null && curNode.next != null) {
            ListNode nextNode = curNode.next;
            curNode = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }
}
