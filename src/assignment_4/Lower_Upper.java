package assignment_4;

import java.util.Scanner;

public class Lower_Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char val = s.charAt(0);

        if (val>= 'a' && val <= 'z'){
            System.out.println("lowercase");
        } else if (val >= 'A' && val<= 'Z') {
            System.out.println("UPPERCASE");
        }else{
            System.out.println("Invalid");
        }
    }
}
