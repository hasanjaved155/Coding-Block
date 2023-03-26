package bitmasking;

import java.util.Scanner;

public class Perfect_Pair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(perfectPair(arr));
    }

    private static int perfectPair(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] & arr[j]) == 0){
                    //System.out.println(arr[i]+" "+arr[j]);
                    count+=2;
                }
                //System.out.println(count);
            }
          // System.out.println(count);
        }
        return count;
    }
}
