package leetcode;

public class Valid_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(validMountain(arr));
    }

    private static boolean validMountain(int[] arr) {
        int i = 0;
        int j = 0;
        if (arr.length == 1 || arr[0] > arr[1])return false;
        while(i < arr.length - 1){
            if (arr[i] == arr[i + 1]){
                return false;
            }
            if (arr[i] > arr[i + 1]){
                j = i;
                break;
            }
            i++;
        }
        if (i == arr.length - 1){
            return false;
        }
        while(j < arr.length - 1){
            if (arr[j] == arr[j + 1]){
                return false;
            }
            if (arr[j] < arr[j + 1]){
                return false;
            }
            j++;
        }
        return true;
    }
}
