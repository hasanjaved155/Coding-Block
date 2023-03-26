package lec25;

import java.util.ArrayList;
import java.util.List;

public class Generate_Prarenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans =  generateParenthesis(n);
        System.out.println(ans);
    }

    private static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        find("",0,0,result,n);
        return result;
    }

    private static void find(String ans, int open, int close, List<String> result, int n) {
        if (ans.length() == 2 * n){
            result.add(ans);
            return;
        }

        if (open < n){
            find(ans + "(",open + 1,close,result,n);
        }
        if (close < open){
            find(ans + ")",open,close + 1,result,n);
        }
    }
}
