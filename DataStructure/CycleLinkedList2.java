package Progress.DataStructure;

public class CycleLinkedList2 {
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
    public static ListNode intersection(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast == null || fast.next == null){ 
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
    public static ListNode detectCycle(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode intersect = intersection(head);
        if(intersect == null) return null;
        ListNode start = head;
        while(intersect != start){
            start = start.next; 
            intersect = intersect.next;
        }
        return start;
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
        ListNode newList = detectCycle(a1);
        System.out.println(newList);
    }
}
