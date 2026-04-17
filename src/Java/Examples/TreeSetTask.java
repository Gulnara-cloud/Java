package Java.Examples;

import java.util.TreeSet;

public class TreeSetTask {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(5);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
