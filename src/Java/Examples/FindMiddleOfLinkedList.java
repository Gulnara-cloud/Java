package Java.Examples;

class ListNode {
    int val;
    listNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class FindMiddleOfLinkedList {

    public static int findMiddle(listNode head) {
        listNode slow = head;
        listNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // 1 шаг
            fast = fast.next.next; // 2 шага
        }
        return slow.val;
    }
    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);
        head.next.next.next.next = new listNode(5);

        System.out.println(findMiddle(head)); // 3
    }
}
