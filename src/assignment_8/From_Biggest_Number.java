package assignment_8;

import java.util.Scanner;

public class From_Biggest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int [] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            biggest(arr);
        }
    }

    private static void biggest(int [] arr) {
        String ans3 = "";
        for (int i = 0; i < arr.length-1; i++) {
            int j = i + 1;
            while(j < arr.length && i < j){
                String ans = arr[i] + "" + arr[j];
                //System.out.println(ans);
                long digit = Long.parseLong(ans);
                String ans2 = arr[j] + "" + arr[i];
                //System.out.println(ans2);
                long digit2 = Long.parseLong(ans2);
                if (digit > digit2)j++;
                else{
                    int left = arr[i];
                    arr[i] = arr[j];
                    arr[j] = left;
                    j++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans3 = ans3 + "" + arr[i];
        }
        System.out.println(ans3);
    }
}
