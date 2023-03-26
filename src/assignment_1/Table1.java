package assignment_1;

import java.util.Scanner;

public class Table1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int i = 2;

        int x = n1;

        while(x<=n2){

           // if (x>n2)break;

            System.out.println(x);

            x = n1*i;

            i++;
        }
    }
}
