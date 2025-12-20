package Java.Examples;

import java.util.List;
import java.util.Vector;

// Vector
// Similar to ArrayList but synchronized.
// Slower due to thread-safety overhead.
// Rarely used today, replaced by:
// Collections.synchronizedList(new ArrayList<>())
// CopyOnWriteArrayList (better for concurrency)
// Use Case: Old multithreaded applications.

public class Vector4 {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        vector.add("Four");
        vector.add("Five");
        vector.add("Six");
        System.out.println(vector);
    }
}
