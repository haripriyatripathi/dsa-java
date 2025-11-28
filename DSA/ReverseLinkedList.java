class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
 }

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List: ");
        printList(head);

        ListNode reversed = reverseList(head);

        System.out.println("Reversed List: ");
        printList(reversed);
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val  + " ");
            node = node.next;
        }
        System.out.println();
    }
}
























