package assignment_5;

import java.util.Scanner;

public class Print_ArmStrong_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        armStrong(start,end);
    }

    private static void armStrong(int start, int end) {
        for(int i = start + 1; i < end; i++){
            int temp2 = i;
            int temp1 = i;
            int n = 0, result = 0;

            while (temp1 != 0){
                temp1 /= 10;
                n++;
            }
            while (temp2 != 0){
                int remainder = temp2 % 10;
                result += Math.pow(remainder, n);
                temp2 /= 10;
            }
            if (result == i) {
                System.out.println(i);
            }
        }
    }
}
