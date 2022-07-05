package Progress.DataStructure;

public class ReverseLinkedListLeet2 {
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
    // step 1: next = head->next;
    // step 2: newHead = reverseList(next);
    // next->next = head
    // head->next = null;
    // step 3: solve special case:
    // 1 node => return node;
    // 0 node => return null;    
    public static ListNode reverseList(ListNode head) {
        //special case:
        if(head == null){
            return null;
        }
        ListNode nextNode = head.next;
        if(nextNode == null){
            return head;
        }
        //general case:
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;

        return newHead;
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
