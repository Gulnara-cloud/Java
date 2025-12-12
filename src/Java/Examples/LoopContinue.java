package Java.Examples;

public class LoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
