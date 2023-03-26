package assignment_5;


import java.util.Scanner;

public class Inverse_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        reverseArray(arr);
    }
    private static void reverseArray(int[] arr) {
        int temp;
        int [] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            brr[temp] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}
