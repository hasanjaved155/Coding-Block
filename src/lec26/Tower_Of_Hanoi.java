package lec26;

import java.util.Scanner;

public class Tower_Of_Hanoi {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        towerOfHanoi(n,"T1","T2","T3");
        System.out.println(count);
    }

    private static void towerOfHanoi(int n, String start, String destination, String helper) {
        if (n == 0)return;
        if(n >= 1)count++;
        towerOfHanoi(n-1 ,start,helper,destination);
        System.out.println("Move " + n + "th disc from " + start + " to " + destination);
        towerOfHanoi(n-1,helper,destination,start);
    }
}
