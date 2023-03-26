package lec18;

import java.util.Scanner;

public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            String s = scanner.next();

            smallestNumber(s);

        }
    }

    private static void smallestNumber(String s) {
        int count = 1;
        int [] arr = new int[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == 'I'){
                arr[i] = count;
                count++;
                for (int j = i - 1; j >= 0 && s.charAt(j) != 'I' ; j--) {
                    arr[j] = count;
                    count++;
                }
            }
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans + arr[i]);
        }
        System.out.println();
    }
}
