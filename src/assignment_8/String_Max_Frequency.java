package assignment_8;

import java.util.Scanner;

public class String_Max_Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char ans = comparison(s);
        System.out.println(ans);
    }

    private static char comparison(String str) {
        char[] charray = new char[26]; //  store the freq of each character
        //String[] charray = str.split("\s+");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charray[c - 'a']++; //Updating the freq of each character each time
        }
        int max = 0;
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
            if (max <= charray[i]) { //Choosing max Freq Character
                max = charray[i];
                ch = (char) (i + 'a');
            }
        }
        return ch; // return character
    }
}
