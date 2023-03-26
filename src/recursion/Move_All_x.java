package recursion;

import java.util.Scanner;

public class Move_All_x {
    static String ans2 = "";
    static String ans_3 = "";
    static String a = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String ans = move(str);
        System.out.println(ans);
    }

    private static String move(String str) {

        if (str.length() == 0){
            return "";
        }
        char ch = str.charAt(0);
        if (ch != 'x'){
            ans2 = ans2+ch;
        }
        else{
            ans_3 = ans_3 + ch;
        }
        move(str.substring(1));
        String ans_1 = ans2 + ans_3;
        return ans_1;
    }
}
