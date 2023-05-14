package hacathon_3;

public class Utkarsh {
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int n = 4;
         time(n,0);
        System.out.println(ans);
    }

    private static void time(int n,int count) {

        if (n == 0){
            ans = Math.min(ans,count);
            return;
        }
        if (n % 2 == 0){
            if (n == 2){
                time(n - 2,count + 1);
            }else {
                time(n - n / 2, count + 1);
            }
        } else if (n % 3 == 0) {
            if (n == 3){
                time(n - 3,count + 1);
            }else {
                time(n - n / 3, count + 1);
            }
        }
        time(n - 1,count + 1);
    }
}
