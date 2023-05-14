package lec37;

import java.util.Stack;

public class Construct_Smallest_Number_From_String {
    public static void main(String[] args) {
        String s = "IIIDIDDD";
        System.out.println(smallestNumber(s));
    }

    private static String smallestNumber(String s) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[s.length() + 1];
        int i = 0;
        int count = 1;
        while (i <= s.length()) {
            if (i == s.length() || s.charAt(i) == 'I') {
                arr[i] = count;
                count++;
                while (!st.isEmpty()) {
                    int ans = st.pop();
                    arr[ans] = count;
                    count++;
                }
            }else {
                st.push(i);
            }
            i++;
        }
        String ans = "";
        for (int j = 0; j < arr.length; j++) {
            ans = ans + arr[j];
        }
        return ans;
    }
}
