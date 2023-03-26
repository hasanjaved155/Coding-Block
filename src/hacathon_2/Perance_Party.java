package hacathon_2;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Perance_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(perance(arr));
    }

    private static int perance(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int ans = 0;
        while(j < arr.length){
            ans = ans + Math.min(arr[i],arr[j]);
            i = i+2;
            j = j+2;
        }
        return ans;
    }
}
