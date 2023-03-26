package lec7;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int [] array = new int[10];
        int count =1;
        while(num>0){
            array[num%10]=count;
            count++;
            num/=10;
        }
        for(int i= array.length-1;i>0;i--){
            if(array[i]!=0){
                System.out.print(""+array[i]);
            }
        }
    }
}
