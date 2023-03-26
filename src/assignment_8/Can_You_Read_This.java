package assignment_8;

import java.util.Scanner;

public class Can_You_Read_This {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        read(s);
    }

    private static void read(String s) {
        for(int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);

//            if(i != 0 && Character.isUpperCase(s.charAt(i))) {
//                System.out.println();
//            }
            if(i != 0 && ch >= 'A' && ch <= 'Z') {
                System.out.println();
            }

            System.out.print(s.charAt(i));
        }
    }
}
