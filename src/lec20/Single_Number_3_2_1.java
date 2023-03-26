package lec20;

public class Single_Number_3_2_1 {
    public static void main(String[] args) {
        int [] arr = {3,1,2,1};
        single_Number(arr);
    }

    private static void single_Number(int[] arr) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        int mask = (ans & (~(ans - 1)));
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((mask & arr[i]) != 0){
                a = a ^ arr[i];
            }
        }
        int b = a ^ ans;
        System.out.println(b + " " + a);
    }
}
