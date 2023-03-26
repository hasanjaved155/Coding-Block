package lec23;

public class Coin_Toss_2 {
    public static void main(String[] args) {
        int n = 3;
        coin_Without_Consecutive_Head(n,"");
    }

    private static void coin_Without_Consecutive_Head(int n,String ans) {
        if (n == 0){
            System.out.print(ans+" ");
            return;
        }

        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            coin_Without_Consecutive_Head(n - 1, ans + "H");
        }
        coin_Without_Consecutive_Head(n-1,ans+"T");
    }
}
