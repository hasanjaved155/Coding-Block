package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(histogram(arr));
    }

    private static long histogram(int[] arr) {
        Stack<Integer>st = new Stack<>();
        long ans = 0;
        int i = 0;
        while (i < arr.length) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int right = i;
                long height = arr[st.pop()];
                if (st.isEmpty()){
                    long area = height * right;
                    ans = Math.max(ans,area);
                }else{
                    int left = st.peek();
                    long area = height * (right - left - 1);
                    ans = Math.max(ans,area);
                }
            }
            st.push(i);
            i++;
        }
        int right = arr.length;
        while (!st.isEmpty()) {
            long height = arr[st.pop()];
            if (st.isEmpty()){
                long area = height * right;
                ans = Math.max(ans,area);
            }else{
                int left = st.peek();
                long area = height * (right - left - 1);
                ans = Math.max(ans,area);
            }
        }
        return ans;
    }
}
