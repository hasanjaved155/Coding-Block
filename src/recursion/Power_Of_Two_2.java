package recursion;

import java.util.Scanner;

public class Power_Of_Two_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {

        if (n == 1){
            return true;
        }
        if (n <= 0 || n % 2 != 0){
            return false;
        }
         return isPowerOfTwo(n/2);
    }
}
