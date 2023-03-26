package binary__Search;

import java.util.Scanner;

public class Container_Most_Water {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        int ans = maxArea(height);
        System.out.println(ans);

    }

    private static int maxArea(int[] height) {
        int n = height.length;
        int right = n-1;
        int left = 0;
        int anss = 0;
        while (left < right){
            int ans = right-left;
            int min_Height = Math.min(height[left],height[right]);
            int area = ans*min_Height;
            anss = Math.max(anss,area);
            if (height[left] < height[right])left++;
            else if (height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return anss;
    }
}
