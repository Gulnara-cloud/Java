package Java.Examples;

import java.util.HashSet;
import java.util.Set;

class listNode {
    int val;
    listNode next;

    listNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class DetectLoopWithHashSet {

    public static boolean hasCycle(listNode head) {
        Set<listNode> visited = new HashSet<>();

        listNode current = head;

        while (current != null) {
            if (visited.contains(current)) {
                return true;
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        listNode n1 = new listNode(1);
        listNode n2 = new listNode(2);
        listNode n3 = new listNode(3);
        listNode n4 = new listNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println(hasCycle(n1)); // true
    }
}
