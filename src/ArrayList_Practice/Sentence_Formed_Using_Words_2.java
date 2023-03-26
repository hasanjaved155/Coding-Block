package ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sentence_Formed_Using_Words_2 {
//    static class Pair{
//        int key;
//        String value;
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        //Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(arr[i].compareTo(arr[j]));
            }
        }

//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
