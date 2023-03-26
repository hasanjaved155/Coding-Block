package assignment_1;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit = scanner.nextInt();
        int count = 0;

        while(num!=0){
            int rem = num%10;
            if (rem==digit)count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
