package assignment_10_Recursion_BackTracking;
import java.util.Scanner;

public class Wildcard_String_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String str = scanner.nextLine();
            wildPattern(str,0,"");
            System.out.println();
        }
    }

    private static void wildPattern(String str, int index,String ans) {
        if (index == str.length()){
            System.out.print(ans+" ");
            return;
        }

        if (str.charAt(index) == '?'){
            wildPattern(str,index + 1,ans + '0');
            wildPattern(str,index+1,ans + '1');
        }else{
            wildPattern(str,index + 1,ans + str.charAt(index));
        }
    }
}
