package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Find_Disappear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer>ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    private static List<Integer> findDisappearedNumbers(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i],1);
        }
        for (int i = 1; i <= n ; i++) {
            if (!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}
