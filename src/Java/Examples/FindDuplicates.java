package Java.Examples;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 3, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                    break;
                }
            }
        }
    }
}