package leetcode;

import java.util.*;

public class Find_Shortest_Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findShortestSubarray(arr));
    }

    private static int findShortestSubarray(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>list = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i]) + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(map.get(arr[i]),ans);
        }
        //System.out.println(map);
        //System.out.println(list);
        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (map.get(arr[i]) == ans){
//                int n1 = list.indexOf(arr[i]);
//                int n2 = list.lastIndexOf(arr[i]);
//                min = Math.min(n2 - n1 + 1,min);
//            }
//        }
        for (Map.Entry<Integer,Integer>m : map.entrySet()){
            if (m.getValue() == ans){
                int n1 = list.indexOf(m.getKey());
                //System.out.println(n1);
                int n2 = list.lastIndexOf(m.getKey());
               //System.out.println(n2);
                min = Math.min(n2 - n1 + 1,min);
            }
        }
        return  min;
    }
}
