package leetcode;

import java.util.Scanner;

public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] arr) {
        int i = 0;
        int j = 1;
        int count = 1;
        while(i < arr.length - 1){
            if (arr[i] != arr[j]){
                arr[count] = arr[j];
                count++;
            }

            i++;
            j++;

        }
        return count;
    }
}
