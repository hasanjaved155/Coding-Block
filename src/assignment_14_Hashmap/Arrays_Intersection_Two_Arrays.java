package assignment_14_Hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Arrays_Intersection_Two_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        ArrayList<Integer>list = intersectionArrays(arr1, arr2);
        System.out.println(list);
    }

    private static ArrayList<Integer> intersectionArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }else {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!map.containsKey(arr2[i])){

            }else if(map.get(arr2[i]) > 0){
                list.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }
        Collections.sort(list);
        return list;
    }
}
