package lec20;

import java.util.Scanner;

public class Single_Number_3 {
    public static void main(String[] args) {
        int n = 100000;
        int arr[] = new int[n];

        Scanner scanner = new Scanner(System.in);
        int sz = scanner.nextInt();
        for (int i = 0; i < sz; i++) {
            int k =scanner.nextInt();
            arr[k]++;
        }



        for (int i = 0; i < n; i++) {

            if(arr[i]==1){
                System.out.print(i+" ");
            }

        }
    }
}
