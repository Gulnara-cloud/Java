package Java.Examples;

import java.util.concurrent.CopyOnWriteArrayList;

// CopyOnWriteArrayList
// Found in java.util.concurrent.
// Thread-safe, but expensive for writes (copies entire list on write).
// Best when you have many reads, few writes.

public class CopyOnWriteArrayList6 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> safeList = new CopyOnWriteArrayList<>();
        safeList.add("A");
        safeList.add("B");
        safeList.add("C");
        safeList.add("D");

        for (String s : safeList) {
            System.out.print(s + " ");
        }
    }
}
