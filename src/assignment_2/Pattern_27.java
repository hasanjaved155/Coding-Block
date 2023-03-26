package assignment_2;

import java.util.Scanner;

public class Pattern_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = 1;
        int  space = n;

        while(row<=n){
            int j = 1;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int l = 1;
            int val = 1;
            while(l<=star){
                System.out.print(val+" ");
                if (l<=star/2){
                    val++;
                }else{
                    val--;
                }
                l++;
            }


//            int k = row;
//            int t = 1;
//            while(k>t){
//                System.out.print(k-1+" ");
//                k--;
//            }
            System.out.println();
            row++;
            star+=2;
            space--;

        }
    }
}
