package Java.Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Doubly linked list: each node stores data, prev, and next.
// Performance:
// Access by index: O(n) (slow lookup)
// Insert/delete at head/tail: O(1)
// Insert/delete in middle: O(1) (if you already have a reference to node, otherwise O(n))
// Implements: List, Deque, Queue
// Use Case: Best when you have frequent add/remove operations.

public class LinkedList3 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Altynai");
        names.add("Chynara");
        names.add("Gulnara");
        names.add(0,"Aidana");
        System.out.println(names);
    }
}
