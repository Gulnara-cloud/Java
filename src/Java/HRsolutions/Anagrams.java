package Java.HRsolutions;

public class Anagrams {
    public static void main(String[] args) {
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] placeForLetters = new int[26];

        for (int i = 0; i < a.length(); i++) {
            placeForLetters[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < a.length(); i++) {
            placeForLetters[b.charAt(i) - 'a']--;
        }
        for (int i : placeForLetters) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
