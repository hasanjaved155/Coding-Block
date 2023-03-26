package assignment_5;

import java.util.Scanner;

public class Is_ArmStrong_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int i, temp1, temp2, remainder, n = 0, result = 0;

        for(i = start + 1; i < end; i++)
        {
            temp2 = i;
            temp1 = i;

            while (temp1 != 0)
            {
                temp1 /= 10;
                n++;
            }

            while (temp2 != 0)
            {
                remainder = temp2 % 10;
                result += Math.pow(remainder, n);
                temp2 /= 10;
            }

            if (result == i) {
                System.out.println(i);
            }

            n = 0;
            result = 0;

        }

    }

}

