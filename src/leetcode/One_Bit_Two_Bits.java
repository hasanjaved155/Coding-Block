package leetcode;

public class One_Bit_Two_Bits {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,0,1,0,0};
        System.out.println(isOne(arr));
    }

    private static boolean isOne(int[] arr) {
        int zero = 0;
        int i = 0;
        while(i < arr.length){
            if (arr[i] == 0){
                zero = 1;
                i++;
            }else{
                zero = 2;
                i = i + 2;
            }
        }
        if (zero == 1)return true;
        return false;
    }
}
