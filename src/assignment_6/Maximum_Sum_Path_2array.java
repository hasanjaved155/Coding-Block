package assignment_6;

import java.util.Scanner;

public class Maximum_Sum_Path_2array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [] arr_1 = new int[n];

            for (int j = 0; j < n; j++) {
                arr_1[j] = scanner.nextInt();
            }
            int [] arr_2 = new int[m];

            for (int j = 0; j < m; j++) {
                arr_2[j] = scanner.nextInt();
            }

            int ans = sumArray(arr_1,arr_2,n,m);
            System.out.println(ans);
        }

    }

    private static int sumArray(int[] arr_1, int[] arr_2, int n, int m) {

        int i = 0  , j = 0 , sum1 = 0 , sum2 = 0 , ans = 0;

        while(i < n && j < m) {

            if (arr_1[i] < arr_2[j]) {
                sum1 = sum1 + arr_1[i];
                i++;
            } else if (arr_1[i] > arr_2[j]) {
                sum2 = sum2 + arr_2[j];
                j++;
            } else {
                ans = ans + Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (arr_1[i] == arr_2[j] && i < n && i < m) {
                    ans = ans + arr_1[i];
                    i++;
                    j++;
                }
            }
        }
            while(i < n){
                sum1 = sum1 + arr_1[i];
                i++;
            }

            while(j < m){
                sum2 = sum2 + arr_2[j];
                j++;
            }
            ans = ans + Math.max(sum1,sum2);
            return ans;
    }
}
