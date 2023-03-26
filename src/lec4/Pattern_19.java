package lec4;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = (n+1)/2;
        int row = 1;
        int star = m;
        int space = -1;
        while (row<=2*m-1){
            int i = 1;
            while (i <= star && i!= m){
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int l = 1;
//            if (row==1){
//                l=2;
//            }
            while(l<=star){
                System.out.print("* ");
                l++;
            }
            if(row<m){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }

            System.out.println();
            row++;

        }
    }
}
