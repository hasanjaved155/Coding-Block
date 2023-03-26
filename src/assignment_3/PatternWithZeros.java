package assignment_3;

import java.util.Scanner;

public class PatternWithZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if(i==0){
                System.out.print(1+"\t");
            }
            else{
                for (int j = 0; j <= i; j++) {
                    if (i==j||j==0){
                        System.out.print(i+1+"\t");
                    }else{
                        System.out.print(0+"\t");
                    }

                }

            }
            System.out.println();
        }


    }
}
