package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Find_Greater_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = scanner.nextInt();
        }
        nextGreater(arr);
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
        int ans = st.pop();
        while (!st.isEmpty()){
            if (arr[ans] < arr[st.peek()]){
                brr[ans] = arr[st.peek()];
                ans = st.pop();
            }
            else{
                brr[ans] = -1;
                ans = st.pop();
            }
            //System.out.print(-1 + " ");
        }
        brr[ans] = -1;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(brr[j] + " ");
        }
        //System.out.println();
    }
}
