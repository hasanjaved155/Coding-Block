package leetcode;

public class Arranging_Coins {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(arrangeCoins(n));
    }

    private static int arrangeCoins(int n) {
        int row = 1;
        while(n > row){
            n = n - row;
            row++;
        }
        if (n < row)return row - 1;

        return row;
    }
}
