package lec10;

import java.util.Scanner;

public class RainWater_Trapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int height[] = new int[n];

            for (int j = 0; j < n; j++) {
                height[j] = scanner.nextInt();
            }

            int ans = trap(height);
            System.out.println(ans);
        }

    }

    private static int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int max_height = 0;
        for (int i = n-1; i >= 0; i--) {
            int water = max_height - height[i];
            if (water < 0){
                water = 0;
            }
            right[i] = water;
            max_height = Math.max(max_height , height[i]);
        }
        // System.out.println(Arrays.toString(right));


        max_height = 0;
        for (int i = 0; i < n; i++) {
            int water = max_height - height[i];
            if (water < 0){
                water = 0;
            }
            left[i] = water;
            max_height = Math.max(max_height , height[i]);
        }
        // System.out.println(Arrays.toString(left));

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans + Math.min(left[i] , right[i]);
        }
        return ans;
    }
}
