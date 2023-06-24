package assignment_14_Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Unlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] ans = unlock(arr,k,n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] unlock(int[] arr, int k, int n) {
        HashMap<Integer, Integer>map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int m = 0;
        while (m < arr.length && k > 0){
            int x = map.get(arr.length - m);
            if (x == m){
                m++;
            }else{
                int temp = arr[x];
                arr[x] = arr[m];
                arr[m] = temp;
                map.put(arr[x],x);
                map.put(arr[m],m);
                m++;
                k--;
            }
        }
        return arr;
    }
}
