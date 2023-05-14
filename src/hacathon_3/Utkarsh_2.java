package hacathon_3;

public class Utkarsh_2 {
    public static void main(String[] args) {
        int n = 4;
         time(n,0);
    }

    private static void time(int n,int count) {

        if (n == 0){
            System.out.println(count);
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
        else {
            time(n - 1,count + 1);
        }
    }
}
