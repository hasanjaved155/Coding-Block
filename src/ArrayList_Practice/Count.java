package ArrayList_Practice;

import java.util.Scanner;

public class Count {
    static int n = 26;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[n];

        String k = scanner.nextLine();
        for (int i = 0; i < k.length(); i++) {
            int d = k.charAt(i)-'a';
            arr[d]++;
        }

        String find = scanner.nextLine();
        int x = find.charAt(0)-'a';


        if (arr[x]==0){
            System.out.println("-1");
        }else{
            System.out.println(arr[x]);
        }


    }
}
