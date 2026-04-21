package Java.Examples;

import java.util.*;

// 4. First Unique Character
class UniqueCharChecker {
    public int firstUnique(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for (char ch : s.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        for (int i = 1; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        UniqueCharChecker checker = new UniqueCharChecker();

        int result = checker.firstUnique("los angeles");

        System.out.println(result);
    }
}