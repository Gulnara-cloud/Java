package basics;

public class LoopsMultiplicationTable {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
        }
    }
}
