package lec16;

import java.util.Scanner;

public class Find_CB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        printSubstring(s);
    }

    private static void printSubstring(String s) {
        int count = 0;
        boolean [] visited = new boolean[s.length()];

        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length() ; j++) {
                int i = j - len;
                String str = s.substring(i,j);
                // Long.parseLong(str)-->String to long
                // Integer.parseInt(str)-->String to int
                if (isCB(Long.parseLong(str)) && isvisited(visited,i,j-1)){
                    count++;
                    for (int k = i; k < j ; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isvisited(boolean[] visited, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (visited[i]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isCB(long n){
        int [] arr = {2,3,5,7,11,13,17,19,23,29};
        if (n == 0 || n == 1)return false;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                return false;
            }
        }

        return true;
    }
}
