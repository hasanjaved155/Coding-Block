package lec9;



public class Swap_Demo_1_1 {
    //static int [] arr = {2,3,1,4,5,6};
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,5,6};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr);
        System.out.print(arr[0]+" "+arr[1]);
    }

    private static void swap(int [] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
