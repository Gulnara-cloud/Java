package Java.Examples;

import java.util.LinkedList;
import java.util.Queue;

//   The main methods of Queue // firs in first out
//	 add(e) / offer(e) → добавить элемент в очередь.
//	 remove() / poll() → удалить и вернуть элемент с начала.
//	 element() / peek() → просто посмотреть на первый элемент (не удаляя).

public class Queue7 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Book 1");
        q.add("Book 2");
        q.add("Book 3");
        q.offer("Book 5");
        System.out.println(q);        // [Book 1, Book 2, Book 3]
        System.out.println(q.peek()); // Book 1 (first)
        System.out.println(q.poll()); // Book 1 removed
        System.out.println(q);        // [Book 2, Book 3]
    }
}
