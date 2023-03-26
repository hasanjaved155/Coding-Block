package assignment_4;

import java.util.Scanner;

public class SumEvenAndOddPlace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int digit;
        int i = 1;
        int ev=0,odd=0;
        while(num>0)
        {
            digit=num%10;
            num=num/10;
            if(i%2!=0)
                odd=odd+digit;
            else
                ev=ev+digit;

            i++;
        }
        System.out.println(odd);
        System.out.println(ev);
    }
}