package Java.Examples;

public class BinaryPowersOfTwo {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++) {
            if(isPowerOfTwo(i)) {
            System.out.println(i + " -> " + Integer.toBinaryString(i));
        }
    }
}
public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
/* n > 0 && (n & (n - 1)) == 0
   8 > 0 && (8 & (8 - 1)) == 0

    1.	8 > 0 → true ✅
	2.	8 - 1 = 7
	•	8 = 1000 (в двоичной)
	•	7 = 0111
	•	1000 & 0111 = 0000 → это 0        1000
	                                      0111
	                                     ------
	                                      0000
	3.	Проверка: (0 == 0) → true ✅

  Итог: 8 → true (степень двойки)
 */
