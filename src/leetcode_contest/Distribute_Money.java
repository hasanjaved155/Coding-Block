package leetcode_contest;

import java.util.Scanner;

public class Distribute_Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int child = scanner.nextInt();
        int ans = distMoney(n,child);
        System.out.println(ans);
    }

    private static int distMoney(int money, int children) {
        if (children > money)return -1;
        if (money >= children && money < 8)return 0;
        int[] arr = new int[children];
        int sum = 0;
        int count = 0;
        int i = 8;
        if (money - children <= 6)return 0;
        if (money - children == 7)return 1;
        if (money - children == 8 || money - children == 9 && money - 8 <= 4)return 1;
        if (money - children >= 9 && money - children <= 13 && money - 8 > 4)return 1;

        for (int j = 0; j < arr.length; j++) {
            arr[j] = i;
            sum = sum + arr[j];
            if (sum > money){
                arr[j] = sum - money - 1;
                if (arr[j] == 4){
                    arr[j] = arr[j] - 1;
                }else {
                    arr[j - 1] = arr[j - 1] + 1;
                }
                i = i + money;
            } else if (sum == children * 8 && sum < money) {
                arr[j] = arr[j] + money - sum;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 8)count++;
        }
        return count;
    }
}
