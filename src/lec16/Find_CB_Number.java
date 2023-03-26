package lec16;

import java.util.Scanner;

public class Find_CB_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int count = 0;
        boolean[] visited = new boolean[str.length()];

        for (int len = 1; len <= str.length(); len++) {

            for (int j = 0; j <= str.length() - len; j++) {

                int i = j + len;

                String ss = str.substring(j, i);

                if (isCBNo(Long.valueOf(ss)) && isValid(visited, j, i)) {

                    count++;

                    for (int k = j; k < i; k++) {
                        visited[k] = true;
                    }

                }
            }

        }

        System.out.println(count);

    }

    public static boolean isValid(boolean[] visited, int start, int end) {

        for (int i = start; i < end; i++) {
            if (visited[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isCBNo(long n) {

        if (n == 0 || n == 1) {
            return false;
        }

        long[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

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
