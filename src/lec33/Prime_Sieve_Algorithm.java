package lec33;

public class Prime_Sieve_Algorithm {
    public static void main(String[] args) {
        int n = 100;

        prime_Sieve(n);
    }
    private static void prime_Sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        prime[0] = true;// prime no nhi hai
        prime[1] = true;// prime no nhi hai

        // jis prime[index] per false agya iska matlab vo index prime no hai

        for (int i = 2; i * i <= prime.length ; i++) {
            if (!prime[i]){
                for (int j = 2; j * i < prime.length ; j++) {
                    prime[j * i] = true;// marked kar diya prime nhi hai
                }
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (!prime[i]){
                System.out.print(i + " ");
                //System.out.print(prime[i] + " ");
            }
        }
    }
}
