package assignment_Revesion;

import java.util.Scanner;

public class Conversion_Faren_Celcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int step = scanner.nextInt();

        conversion(min,max,step);
    }

    private static void conversion(int min, int max, int step) {
        while (min<=max){
            int c = (int)((5.0/9)*(min-32));
            System.out.println(min+" "+c);
            min = min + step;
        }
    }
}
