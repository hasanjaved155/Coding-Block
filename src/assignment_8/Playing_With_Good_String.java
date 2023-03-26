package assignment_8;

import java.util.Scanner;

public class Playing_With_Good_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int ans = countString(s);
        System.out.println(ans);
    }

    private static int countString(String s) {
        int count = 0, res = 0;
        char[] str = s.toCharArray();
        String ans = "";

        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) count++;
            else{
                res = Math.max(res, count);
                count = 0;
            }
        }

        return Math.max(res, count);
    }

    private static boolean isVowel(char c) {
//        return (c == 'a' || c == 'e' || c == 'i'
//                || c == 'o' || c == 'u');
        if (c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}
