package assignment_4;

import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        float D = (b*b)-(4*a*c);

        if (D > 0){
            int x = (int) ((-b + Math.sqrt(D))/(2*a));
            int y = (int) ((-b - Math.sqrt(D))/(2*a));
            System.out.println("Real and Distinct");
            System.out.print(y+" ");
            System.out.print(x);
        } else if (D == 0) {
            int x = -b/(2*a);
            int y = -b/(2*a);
            System.out.println("Real and Equal");
            System.out.print(y+" ");
            System.out.print(x);
        }
        else{
            System.out.println("Imaginary");
        }
    }
}
