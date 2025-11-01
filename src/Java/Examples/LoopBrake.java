package Java.Examples;

public class LoopBrake {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
