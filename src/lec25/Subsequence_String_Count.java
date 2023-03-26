package lec25;

public class Subsequence_String_Count {
    public static void main(String[] args) {

        String s = "abc";
        System.out.println(subsequence(s,""));
    }

    private static int subsequence(String s,String ans) {
        if (s.length() == 0){
            //System.out.print(ans + " ");
            return 1;
        }

        char ch = s.charAt(0);
        int f1 = subsequence(s.substring(1),ans);
        int f2 = subsequence(s.substring(1),ans + ch);

        return f1 + f2;
    }
}
