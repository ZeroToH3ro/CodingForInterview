package Progress.DataStructure;

public class LinkedList {
    public static class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
    public static Node addToHead(Node head, int value){
        Node newNode = new Node(value);
        if(head == null){
            return head;
        } else {
            newNode.next = head;
        }
        return newNode;
    }
    public static Node removeAtHead(Node head){
        if(head != null){
            return head.next;
        }
        return head;
    }
    public static Node addToTail(Node head,int value){
        Node newNode = new Node(value);
        if(head == null){
            System.out.println("The list is empty");
        } else {
            Node lastNode = head;
            //Step 1: define the last of the list
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            //Step 2: add next for the last node
            lastNode.next = newNode;
        }
        return newNode;

    }
    public static Node removeAtTail(Node head){
        if(head == null){
            System.out.println("The list is empty");
        }
        //Step 1: define the last node and the previous node
        Node lastNode = head;
        Node previous = null;

        while(lastNode.next != null){
            previous = lastNode;
            lastNode = lastNode.next;
        }
        if(previous == null){
            return null;
        } else {
            previous.next = lastNode.next;

        }
        return head;
    }
    public static Node addToIndex(Node head, int value, int index){
        if(index == 0){
            return addToHead(head, value);
        } else {
            // Step 1: find the index to insert node
            Node currentNode = head;
            Node newNode = new Node(value);
            int count = 0;
            while(currentNode != null){
                count++;
                if(count == index){
                    // Step 2: insert node
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        return head;
    }
    public static Node removeAtIndex(Node head,  int index){
        if(head == null || index < 0){
            return null;
        }
        if (index == 0){
            return removeAtHead(head);
        }
        Node currentNode = head;
        Node previous = null;
        int count = 0;
        boolean isFound = false;
        while(currentNode.next != null){
            if(count == index){
                // remove node
                isFound = true;
                break;
            }
            previous = currentNode;
            currentNode = currentNode.next;
            count ++;
        }
        //remove current index
        if(isFound){
            if(previous == null){
                return null;
            } else {
                previous.next = currentNode.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        Node n4 = addToHead(n1, 4);
        Node n5 = addToTail(n1, 99);
        Node n6 = addToIndex(n1, 6, 2);
        n4 = removeAtHead(n4);
        n5 = removeAtTail(n2);
        n1 = removeAtIndex(n1,2);
        printLinkedList(n4);
    }
}
