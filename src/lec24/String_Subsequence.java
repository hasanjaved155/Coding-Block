package lec24;

public class String_Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        subsequence(s);
    }

    private static void subsequence(String s) {
        int n = s.length();
        for (int i = 0; i <(1 << n); i++) {
            patter(i,s);
        }
    }
    private static void patter(int i, String s) {
        int pos = 0;
        while(i != 0){
            if ((i & 1) != 0) {
                System.out.print(s.charAt(pos));
            }
            pos++;
            i >>= 1;
        }
        System.out.println();
    }
}
