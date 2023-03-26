package lec20;

import java.util.HashMap;
import java.util.Scanner;

public class Single_Number3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            map.put(scanner.nextInt(), 1);
        }
        System.out.println(map);


//        int [] ans = single_Number_3(map);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i]+" ");
//        }
//    }
//
//    private static int[] single_Number_3(HashMap<Integer, Integer> map) {
//
//
//    }
    }
}
