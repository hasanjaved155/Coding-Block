package assignment_Revesion;

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        series(n1,n2);
    }

    private static void series(int n1, int n2) {

        int x = 1;
        int count = 0;
        while(count < n1){
            int ans = (3*x)+2;
            if (ans % n2 != 0){
                System.out.println(ans);
                count++;
            }
            x++;
        }
    }
}
