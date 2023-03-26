package assignment_4;

import java.util.Scanner;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int x = 0;
            int y = 0;

            for (int j = 1;  ; j = j + 2) {
                x = x + j;
                y = y + j + 1;

                if (x > m){
                    System.out.println("Harshit");
                    break;
                }
                if (y > n){
                    System.out.println("Aayush");
                    break;
                }
            }
        }
    }
}
