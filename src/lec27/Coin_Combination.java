package lec27;

public class Coin_Combination {
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int amount = 8;
        coin_Permutation(coin,amount,"",0);
    }

    private static void coin_Permutation(int[] coin, int amount, String ans,int index) {
        if (amount == 0){
            System.out.println(ans);
            return;
        }
        for (int i = index; i < coin.length; i++) {
            if (amount >= coin[i]){
                coin_Permutation(coin,amount - coin[i],ans + coin[i],i);
            }
        }
    }
}
