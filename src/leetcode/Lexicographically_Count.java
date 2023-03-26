package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexicographically_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = count(n);
        System.out.println(list);
    }

    private static List<Integer> count(int end) {
        List<Integer>l = new ArrayList<>();
        lexico_Count(0,end,l);
        return l;
    }

    private static void lexico_Count(int start, int end,List<Integer>l) {
        if (start > end) return;
        if (start != 0) {
            l.add(start);
        }
        int i = 0;
        if (start == 0)i = 1;

        for (; i <= 9; i++) {
            lexico_Count(start * 10 + i, end,l);
        }
    }
}
