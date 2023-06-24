package dp_leetcode;

public class Maximal_Square {
    public static void main(String[] args) {
        char[][] matrix = {
                 {'1','0','1','0','0'}
                ,{'1','0','1','1','1'}
                ,{'1','1','1','1','1'}
                ,{'1','0','0','1','0'}
        };

        System.out.println(maximalSquare(matrix));
    }

    private static int maximalSquare(char[][] mat) {
        int[][] matrix = new int[mat.length][mat[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int digit = mat[i][j] - '0';
                matrix[i][j] = digit;
            }
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans = Integer.MIN_VALUE;
        for (int i = dp.length - 1; i >= 0 ; i--) {
            for (int j = dp[0].length - 1; j >= 0 ; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1){
                    dp[i][j] = matrix[i][j];
                } else if (i == dp.length - 1) {
                    dp[i][j] = matrix[i][j];
                } else if (j == dp[0].length - 1) {
                    dp[i][j] = matrix[i][j];
                }else {
                    if (matrix[i][j] == 0){
                        dp[i][j] = 0;
                    }else {
                        dp[i][j] = Math.min(dp[i][j + 1], Math.min(dp[i + 1][j + 1], dp[i + 1][j])) + 1;
                    }
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                ans = Math.max(ans,dp[i][j]);
            }
        }

        return ans * ans;
    }
}
