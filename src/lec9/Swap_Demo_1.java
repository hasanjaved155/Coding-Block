package lec9;



public class Swap_Demo_1 {
    //static int [] arr = {2,3,1,4,5,6};
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,5,6};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr,0,1);
        System.out.print(arr[0]+" "+arr[1]);
    }

    private static void swap(int [] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
//Java uses only call by value while passing reference variables as well.
// It creates a copy of references and passes them as valuable to the methods.
// As reference points to same address of object, creating a copy of reference is of no harm.
// But if new object is assigned to reference it will not be reflected.