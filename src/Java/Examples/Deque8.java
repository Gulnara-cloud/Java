package Java.Examples;

import java.util.ArrayDeque;
import java.util.Deque;

//             Deque (двусторонняя очередь)
//		Deque = Double Ended Queue (двусторонняя очередь).
//		Можно добавлять и забирать элементы с обеих сторон.
//		Универсальнее, чем обычная Queue.
//		В пакете java.util реализуется, например, через ArrayDeque или LinkedList.
//
//                Основные методы Deque
//		addFirst(e) / offerFirst(e) → добавить в начало.
//		addLast(e) / offerLast(e) → добавить в конец.
//		removeFirst() / pollFirst() → удалить из начала.
//		removeLast() / pollLast() → удалить из конца.
//		getFirst() / peekFirst() → посмотреть первый.
//		getLast() / peekLast() → посмотреть последний.

public class Deque8 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.addFirst("A");  // [A]
        dq.addLast("B");   // [A, B]
        dq.addFirst("C");  // [C, A, B]

        System.out.println(dq);              //  [C, A, B]
        System.out.println(dq.pollLast());   //  B
        System.out.println(dq.pollFirst());  //  C
        System.out.println(dq.offerFirst("K")); // True - If the item has been successfully added
        System.out.println(dq.offerLast("D")); //  ArrayDeque will almost always be true, as it is not limited in size
        System.out.println(dq.peekFirst());
        System.out.println(dq);              //  [A]
    }
}
