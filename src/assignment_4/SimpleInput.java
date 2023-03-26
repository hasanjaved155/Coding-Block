package assignment_4;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            int m = scanner.nextInt();
            sum = sum + m;
            if (sum<0){
                return;
            }else{
                System.out.println(m);
            }
        }
    }
}
