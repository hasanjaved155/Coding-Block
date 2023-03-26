package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class Contains_Duplicate_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        boolean ans = single_Number(arr,k);
        System.out.println(ans);
    }

    private static boolean single_Number(int[] arr,int k) {
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i],i);
            }else{
                int j = i;
                int m = map.get(arr[j]);
                if ((j - m) <= k){
                    return true;
                }
                else{
                    map.put(arr[i],i);
                }
            }
        }

        return false;
    }
}