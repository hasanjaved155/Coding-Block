package assignment_7;

import java.util.Scanner;

public class Piyush_Magical_Park {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        char [][] arr = new char[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.next().charAt(0);
            }
        }
        magical_Park(arr,k,s);
    }

    private static void magical_Park(char[][] arr, int k, int s) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (s<k)break;
                if (arr[i][j]=='.'){
                    s = s-2;

                }else if (arr[i][j]=='*') {
                    s = s+5;

                }else {
                    break;
                }
                if (j!=arr[0].length-1)s--;
            }
        }
        if(s>=k) {
            System.out.println("Yes");
            System.out.println(s);
        }else{
            System.out.println("No");
        }
    }
}
