package assignment_9;

import java.util.Scanner;

public class Incedible_Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            System.out.println(hulk(n));
        }
    }

    private static int hulk(int n) {
         int ans = 0;
         while (n > 0){
             int r = n % 2;
             n = n >> 1;
             if (r == 1)ans++;
         }
         return ans;
    }
}
