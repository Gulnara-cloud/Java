package Java.Examples;

import java.util.ArrayList;
import java.util.List;

// List is an interface in the Collections Framework (java.util).
// It extends Collection → ordered collection, allows duplicates, supports index-based
// operations.
// Key methods:
// add(E e), add(int index, E e), get(int index), set(int index, E e),
// remove(int index), size(), contains(Object o), indexOf(Object o), subList()

public class ListExample1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // add
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        System.out.println(fruits);

        // access by index, get
        System.out.println(fruits.get(1));

        // replace, set
        fruits.set(3, "Orange");
        System.out.println(fruits);

        // remove
        fruits.remove("Apple");
        System.out.println(fruits);

        // size
        System.out.println(fruits.size());

        // contains
        System.out.println(fruits.contains("Banana")); //true

        // indexOf
        System.out.println(fruits.indexOf("Orange")); //2

        // subList , (fromIndex - inclusive, toIndex - exclusive)
        List<String> sub = fruits.subList(0, 2); // from banana to cherry
        System.out.println(sub);
        sub.set(0, "Strawberry");
        System.out.println(fruits);
    }
}
