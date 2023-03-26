package lec33;

import java.util.Random;

public class Random_Number {
    public static void main(String[] args) {
        int low = 10;
        int high = 100;
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(high - low + 1) + low;
            System.out.print(num + " ");
        }
    }
}
