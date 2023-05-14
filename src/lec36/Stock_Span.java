package lec36;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        stockSpan(arr);
    }
    private static void stockSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] brr = new int[arr.length];
        int i = 0;
        while(i < arr.length) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()){
                brr[i] = i + 1;
            }else{
                brr[i] = i - st.peek();
            }
            st.push(i);
            i++;
        }
        for (int j = 0; j < brr.length; j++) {
            System.out.print(brr[j] + " ");
        }
        System.out.print("END");
    }
}
