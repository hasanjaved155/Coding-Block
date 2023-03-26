package assignment_9;

import java.util.Scanner;

public class Count_Set_Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            System.out.println(count_Bit(n));
        }
    }

    private static int count_Bit(int n) {

        int count = 0;
        while (n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
