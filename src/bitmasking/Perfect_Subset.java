package bitmasking;

import java.util.ArrayList;
import java.util.Scanner;

public class Perfect_Subset {
    static ArrayList<Integer>path = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(perfect_Subset(arr,0));
    }

    private static int perfect_Subset(int[] arr,int index) {
        int count = 0;
        int count2 = 0;
        if (index == arr.length) {
            if (path.size() > 0){
                if (path.size() == 1){
                    if (path.get(0)==1)count++;
                   // System.out.println(count);
                }else{
                    int ans2 = path.get(0);
                    for (int i = 1; i < path.size(); i++) {
                        ans2 = ans2 * path.get(i);
                    }
                    //System.out.print(ans2 + " ");
                    while(ans2 != 0) {
                        if (ans2 % 2 == 0) count2++;
                        ans2 = ans2 / 2;
                    }
                    //System.out.print(count2+" ");

                    if (count2 % 2 == 0)count++;
                    System.out.println(count);

                }

            }
        }

        else {
            perfect_Subset(arr, index + 1);
            path.add(arr[index]);

            perfect_Subset(arr, index + 1);
            path.remove(path.size() - 1);
        }
        return count;
    }
}
