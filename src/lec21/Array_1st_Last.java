package lec21;

public class Array_1st_Last {
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,5,4,7,4,2};
        int item = 8;
        System.out.println(Index(arr,item,arr.length-1));
    }

    private static int Index(int[] arr, int item,int index) {
        //Tail Recursion
        if (index == 0)return -1;

        if (arr[index]==item)return index;
        return Index(arr,item,index-1);
    }
}
