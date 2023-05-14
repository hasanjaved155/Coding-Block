package assignment_10_Recursion_BackTracking;

import java.util.Scanner;

public class First_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int find = scanner.nextInt();
        firstIndex(arr,find,0);
    }

    private static void firstIndex(int[] arr, int find,int index) {
        if (index == arr.length){
            System.out.println(-1);
            return;
        }
        if (arr[index] == find){
            System.out.println(index);
            return;
        }

        firstIndex(arr,find,index + 1);

    }
}
