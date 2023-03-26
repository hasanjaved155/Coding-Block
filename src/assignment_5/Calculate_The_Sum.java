package assignment_5;

import java.util.Scanner;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = scanner.nextInt();

        int temp[] = new int[n];
        for(int i=0; i<n; i++)
            temp[i] = a[i];

        int q = scanner.nextInt();
        while(q-- > 0)
        {
            System.out.print(q+" ");
            System.out.println();
            int x = scanner.nextInt();
            x = x % a.length;
            System.out.print(x+" ");
            System.out.println();

            for(int i=0; i<n; i++)
            {
                int r = i - x;
                if(r < 0)
                    r = n + r;
                System.out.print(r+" ");

                a[i] = a[i] + temp[r];
            }

            for(int i=0; i<n; i++)
                temp[i] = a[i];
        }

        int sum = 0;
        for(int i=0; i<n; i++)
            sum += a[i];

        System.out.println();
        System.out.println(sum % ((int)Math.pow(10, 9) + 7));
    }
}
