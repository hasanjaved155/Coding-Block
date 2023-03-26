package leetcode;

import java.util.Scanner;

public class Search_Insert_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(searchInsert(arr,target));
    }

    private static int searchInsert(int[] arr, int target) {
//        int i = 0;
//        while(i < arr.length){
//            if (arr[i] == target){
//                return i;
//            } else if (arr[i] > target) {
//                return i;
//            }
//            i++;
//        }
//        return i;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
