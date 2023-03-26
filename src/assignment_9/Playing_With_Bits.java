package assignment_9;

import java.util.Scanner;

public class Playing_With_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            System.out.println(count_Bit(n1,n2));
        }
    }

    private static int count_Bit(int n1, int n2) {

        int count = 0;
        while(n1 <= n2){
            int n = n1;
            while (n > 0){
                count++;
                n = n & (n-1);
            }
            n1++;
        }
        return count;
    }
}
