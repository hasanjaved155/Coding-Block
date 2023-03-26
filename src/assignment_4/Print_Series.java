package assignment_4;

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int cnt = 0;
        int i = 1;
        while(cnt<n1){
            int x = (3*i)+2;
            if (x%n2!=0){
                System.out.println(x);
                cnt++;
            }
            i++;
        }
    }
}
