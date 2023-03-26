package assignment_9;

import java.util.Scanner;

public class Unique_Number_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        single_Number(arr);
    }

    private static void single_Number(int[] arr) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        int mask = (ans & (~(ans - 1)));
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((mask & arr[i]) != 0){
                a = a ^ arr[i];
            }
        }
        int b = a ^ ans;
        System.out.println(b + " " + a);
    }
}
