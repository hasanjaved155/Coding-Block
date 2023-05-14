package assignment_5;

import java.util.Scanner;

public class Is_Armstrong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isArmStrong(n));
    }

    public static boolean isArmStrong(int n){
        int l=count(n);
        int temp=n;
        int sum=0;
        while(n>0){
            int rem= n%10;
            sum= (int)(sum+Math.pow(rem,l));
            n/=10;
        }
        if(temp==sum){
            return true;
        }else{
            return false;
        }
    }

    public static int count(int a) {
            int i=0;
            while(a>0) {
                a=a/10;
                i++;
            }
            return i;
        }
}
