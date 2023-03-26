package lec33;

public class Check_Prime {
    public static void main(String[] args) {
        int n = 87;

        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {

        int div = 2;
        while(div * div <= n){
            if (n % div == 0){
                return false;
            }
            div++;
        }
        return true;
    }
}
