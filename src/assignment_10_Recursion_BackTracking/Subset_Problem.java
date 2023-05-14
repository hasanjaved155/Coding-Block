package assignment_10_Recursion_BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();

        subset_Problem(arr,target,0,list);
        System.out.println(list);
    }

    private static void subset_Problem(int[] arr, int target,int index,ArrayList<ArrayList<Integer>>list) {
        if (index == arr.length)return;
        for (int i = index; i < arr.length - 1; i++) {
            if (target - arr[i] == arr[i + 1]){
                ArrayList<Integer>l = new ArrayList<>();
                l.add(arr[i]);
                l.add(arr[i + 1]);
                list.add(l);
                break;
            }else{
                break;
            }
        }
        if (arr[index] == target){
            ArrayList<Integer>l = new ArrayList<>();
            l.add(arr[arr.length - 1]);
            list.add(l);
        }

        subset_Problem(arr,target,index + 1,list);
    }
}
