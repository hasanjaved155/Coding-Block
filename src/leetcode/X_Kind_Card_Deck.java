package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class X_Kind_Card_Deck {
    public static void main(String[] args) {
        int[] deck = {1,1,1,2,2,2,3,3};
        System.out.println(isPossibleDeck(deck));
    }

    private static boolean isPossibleDeck(int[] deck) {
        HashMap<Integer,Integer>map = new HashMap<>();
        if (deck.length == 1) return false;
        for (int i = 0; i < deck.length; i++) {
//            if (!map.containsKey(deck[i])){
//                map.put(deck[i],1);
//            }else{
//                map.put(deck[i],map.get(deck[i]) + 1);
//            }
            //or
            map.put(deck[i],map.getOrDefault(deck[i],0) + 1);
        }
        int ans = 0;
//        for(Map.Entry<Integer,Integer>e : map.entrySet()){
//            ans = gcd(ans,e.getValue());
//        }
        for(int key : map.keySet()){
            ans = gcd(ans,map.get(key));
        }
        if (ans >= 2)return true;
        return false;
    }

    private static int gcd(int a, int b) {
        while(a % b != 0){
            int gcd = a % b;
            a = b;
            b = gcd;
        }
        return b;
    }
}
