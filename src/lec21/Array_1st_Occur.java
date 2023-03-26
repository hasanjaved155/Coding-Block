package lec21;

public class Array_1st_Occur {
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,5,4,7,4,2};
        int item = 4;
        System.out.println(Index(arr,item,0));
    }

    private static int Index(int[] arr, int item,int index) {
        if (index == arr.length)return -1;

        if (arr[index]==item)return index;
        return Index(arr,item,index+1);
    }
}
