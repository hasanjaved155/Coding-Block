package lec46_OOPS_Generics;

public class Generics {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,40,50};
        display(arr);
        String[] arr1 = {"riya","anku","puneet","rajesh","amisha"};
        display(arr1);
    }

    private static <T> void display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
