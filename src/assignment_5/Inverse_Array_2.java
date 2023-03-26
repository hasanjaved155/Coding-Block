package assignment_5;


import java.util.Scanner;

public class Inverse_Array_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[arr.length];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr,0,brr);


        for (int i = 0; i < n; i++) {
            System.out.print(brr[i]+" ");

        }
    }

    private static void reverseArray(int[] arr, int index, int[] brr) {
        if (index>= arr.length){
            return;
        }

        int temp = arr[index];
        brr[temp] = index;



        reverseArray(arr,index+1, brr);


    }
}