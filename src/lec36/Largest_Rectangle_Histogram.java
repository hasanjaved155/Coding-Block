package lec36;

import java.util.Stack;

public class Largest_Rectangle_Histogram {
    public static void main(String[] args) {
        int[] heights = {2, 3, 5, 4, 6, 1, 7};
        System.out.println(largestArea(heights));
    }

    private static int largestArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                int right = i;
                int height = heights[st.pop()];
                if (st.isEmpty()) {
                    int area = height * right;
                    ans = Math.max(ans, area);
                } else {
                    int left = st.peek();
                    int area = height * (right - left - 1);
                    ans = Math.max(ans, area);
                }
            }
            st.push(i);
        }
        int right = heights.length;
        while (!st.isEmpty()) {
            int height = heights[st.pop()];
            if (st.isEmpty()) {
                int area = height * right;
                ans = Math.max(ans, area);
            } else {
                int left = st.peek();
                int area = height * (right - left - 1);
                ans = Math.max(ans, area);
            }
        }
        return ans;
    }
}
