package lec18;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Triversal {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int [] ans = findDiagonalOrder(mat);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+",");
        }
    }

    private static int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int [] arr = new int[m * n];
        int l = 0;
        for (int d = 0; d < m + n - 1; d++) {
            int r = 0 , c = 0;
            if (d < m) c = d;
            else {
                r = d - m + 1;
                c = m - 1;
            }
            ArrayList<Integer> list = new ArrayList<>();
            while(r < n && c >= 0){
               list.add(mat[r][c]);
                r++;
                c--;
            }
            if (d % 2 == 0){
                Collections.reverse(list);
            }
           // System.out.println(list);

            for (int i = 0; i < list.size(); i++) {
                arr[l] = list.get(i);
                l++;
            }
        }
        return arr;
    }
}
