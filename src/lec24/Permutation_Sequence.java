package lec24;

public class Permutation_Sequence {
    public static void main(String[] args) {
        String s = "abcd";
        permutation(s,"");
    }

    private static void permutation(String s, String ans) {
        if (s.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String rem = s.substring(0,i) + s.substring(i+1);

            permutation(rem,ans+ch);
        }
    }
}
