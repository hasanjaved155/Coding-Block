package assignment_5;

import java.util.Scanner;

public class Alex_Shopping {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        alex(arr,n);
    }

    private static void alex(int[] arr, int n) {

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int count = 0;
            int a = scanner.nextInt();
            int k = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                if (a%arr[j]==0)count++;
            }
            if (count>=k){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }
}
