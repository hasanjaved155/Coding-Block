package lec22_Recursion;

public class Subsequence_String {
    public static void main(String[] args) {

        String s = "abc";
        subsequence(s,"");
    }

    private static void subsequence(String s,String ans) {
        if (s.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        char ch = s.charAt(0);
        subsequence(s.substring(1),ans);
        subsequence(s.substring(1),ans + ch);
    }
}
