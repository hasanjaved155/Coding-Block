package recursion;

import java.util.Scanner;

public class Power_Of_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {

        if (n == 1){
            return true;
        }
        if (n <= 0){
            return false;
        }
        while(n > 1){
            if (n % 2 != 0)return false;

            n = n/2;
        }
        return true;
    }
}
