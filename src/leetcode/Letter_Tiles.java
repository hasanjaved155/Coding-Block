package leetcode;

public class Letter_Tiles {
    public static void main(String[] args) {
        String tiles = "AAB";
        System.out.println(numTilePossibilities(tiles));
    }

    private static int numTilePossibilities(String tiles) {
        int count = num(tiles,"");
        return count;
    }

    private static int num(String tiles,String ans) {
//        if (tiles.length() == 0){
//            return;
//        }

       // System.out.println(ans);
        int count = 0;
        for (int i = 0; i < tiles.length(); i++) {
            char ch = tiles.charAt(i);
            boolean flag = false;
            for (int j = i+1; j < tiles.length(); j++) {
                if (ch == tiles.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                String rem = tiles.substring(0, i) + tiles.substring(i + 1);
                count = count + num(rem, ans + ch) + 1;
            }
        }
        return count;
    }
}
