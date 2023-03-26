package assignment_1;

import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int i = 1;

        while (i<=n2){
            int mul = n1*i;
            System.out.println(mul);
            i++;
        }
    }
}
