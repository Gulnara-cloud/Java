package Java.Examples;

public class NestedLoop {
    public static void main(String[] args) {
 //   nested lop = A loop inside another loop
 //                Used often with matrices or DS&A

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
