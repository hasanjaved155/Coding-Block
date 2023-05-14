package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Playing_With_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        Stack<Integer>st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(scanner.nextInt());
        }
        for (int i = 1; i <= q ; i++) {
            int ithPrime = nthPrime(i);
            Stack<Integer>A = new Stack<>();
            Stack<Integer>B = new Stack<>();
            while (!st.isEmpty()){
                int item = st.pop();
                if (item % ithPrime == 0){
                    B.push(item);
                }else {
                    A.push(item);
                }
            }
            while (!B.isEmpty()){
                System.out.println(B.pop());
            }
            st = A;
        }
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    private static int nthPrime(int n){
        int count = 0;
        int i = 2;
        while (count < n){
            if (isPrime(i))count++;
            i++;
        }
        return i - 1;
    }
    private static boolean isPrime(int i){
        int div = 2;
        while (div * div <= i){
            if (i % div == 0){
                return false;
            }
            div++;
        }
        return true;
    }
}
