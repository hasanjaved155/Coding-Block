package lec14;

import java.util.Scanner;

public class Serach_in_two_D_matrix_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int target = scanner.nextInt();

        int ans = searchMatrix(arr,target);
        System.out.println(ans);
     }

    private static int searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return 0;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return 1;
            } else if(target < matrix[row][col]) {
                col--;
            } else  {
                row++;
            }
        }
        return 0;
    }
}
