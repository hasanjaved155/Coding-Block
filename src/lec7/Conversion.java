package lec7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        int d=inp.nextInt();
        int C;

        convert(a,b,d);

//        while(a<=b){
//            C = (int)((5.0/9)*(a-32));
//            System.out.println(a+"\t"+C);
//            a+=d;
//        }
//


    }

    private static void convert(int ll, int ul, int step) {
        for(int i=ll;i<=ul;i=i+step){
            int c=(int)((5.0/9)*(i-32));

            System.out.println(i+ "\t" +c);
        }
    }
}