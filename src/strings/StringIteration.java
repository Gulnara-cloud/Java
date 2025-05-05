package strings;

public class StringIteration {
    public static void main(String[] args) {
        String s = "string";
        char[] c = new char[]{'s', 't', 'r', 'i', 'n', 'g'};
        for (int i = 0; i < c.length; ++i) {
            System.out.println(c[i]);
        }
        for (int i = 0; i < s.length(); ++i) {
            System.out.println(s.charAt(i));
        }
    }
}
