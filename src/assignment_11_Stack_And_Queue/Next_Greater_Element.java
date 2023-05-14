package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            nextGreater(arr);
        }
    }
    private static void nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] brr = new int[arr.length];
        int i = 0;
        while(i < arr.length) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int ans = st.pop();
                brr[ans] = arr[i];
                //System.out.print(arr[i] + " ");
            }
            st.push(i);
            i++;
        }
        while (!st.isEmpty()){
            int ans = st.pop();
            brr[ans] = -1;
            //System.out.print(-1 + " ");
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+","+brr[j]);
        }
        //System.out.println();
    }
}
