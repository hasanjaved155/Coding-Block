package lec23;

public class Coin_Toss {
    public static void main(String[] args) {
        int n = 3;
        coin(n,"");
    }

    private static void coin(int n,String ans) {
        if (n == 0){
            String pre = ans;
            int x = 0;
            int count = 0;
            while(x < ans.length()){
                if (pre.charAt(0) == 'H'){
                    count++;
                }

                pre = pre.substring(1);
                x++;
            }
            if (count > 1) {
                return;
            }else{
                System.out.print(ans+" ");
                return;
            }
        }

        coin(n-1,ans+"H");
        coin(n-1,ans+"T");

    }
}
