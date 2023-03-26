package assignment_Revesion;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] ans = reverse(n);
        for (int i = ans.length - 1; i >= 0 ; i--) {
            if (ans[i] != 0){
                System.out.print(ans[i]);
            }
        }
    }

    private static int[] reverse(int n) {
        int [] arr = new int[10];
        int count = 0;
        while(n > 0){
            int r = n % 10;
            count = count + 1;
            arr[r] = count;
            n = n / 10;
        }
        return arr;
    }
}
