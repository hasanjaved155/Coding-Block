package assignment_Recursion_BackTracking_10;
import java.util.Scanner;

public class Wildcard_String_Pattern_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String str = scanner.nextLine();

            char[] s = str.toCharArray();
            wildPattern(s,0);
        }
    }

    private static void wildPattern(char[] s, int index) {
        if (index == s.length){
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i]);
            }
            System.out.print(" ");
            return;
        }

        if (s[index] == '?'){
            s[index] = '0';
            wildPattern(s,index + 1);
            s[index] = '1';
            wildPattern(s,index + 1);
            s[index] = '?';
        }else{
            wildPattern(s,index + 1);
        }
    }
}
