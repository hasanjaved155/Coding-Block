package leetcode_contest;

public class Largest_Balanced_Substring_2609 {
    public static void main(String[] args) {
        String s = "01000111";
        System.out.println(longest_Balanced(s));
    }
    private static int longest_Balanced(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0'){
                int zero = 0;
                int one = 0;
                while (i < s.length() && s.charAt(i) == '0'){
                    zero++;
                    i++;
                }
                while (i < s.length() && s.charAt(i) == '1'){
                    one++;
                    i++;
                }
                i--;
                int diff = Math.abs(zero - one);
                int ans =  zero + one - diff;
                max = Math.max(ans,max);
            }
        }
        return max;
    }
}
