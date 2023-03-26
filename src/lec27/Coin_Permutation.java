package lec27;

public class Coin_Permutation {
    public static void main(String[] args) {
        int[] coin = {2,3,5,6};
        int amount = 10;
        coin_Permutation(coin,amount,"");
    }

    private static void coin_Permutation(int[] coin, int amount, String ans) {
        if (amount == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]){
                coin_Permutation(coin,amount - coin[i],ans + coin[i]);
            }
        }
    }
}
