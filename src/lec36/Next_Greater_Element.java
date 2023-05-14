package lec36;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr = {20,5,3,2,19,14,12,13};

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
        while (!st.isEmpty()){
            int ans = st.pop();
            brr[ans] = -1;
            //System.out.print(-1 + " ");
        }
        System.out.println(Arrays.toString(brr));
    }
}
