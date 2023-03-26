package lec24;

public class Permutation_Sequence_Duplicate_Remove {
    public static void main(String[] args) {
        String s = "abca";
        permutation(s,"");
    }

    private static void permutation(String s, String ans) {
        if (s.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean flag = false;
            for (int j = i+1; j < s.length(); j++) {
                if (ch == s.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                String rem = s.substring(0, i) + s.substring(i + 1);
                permutation(rem, ans + ch);
            }
        }
    }
}
