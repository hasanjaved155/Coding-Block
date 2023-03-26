package lec26;

public class Nokia_Keypad {
    static String[] nokia = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
        String s = "12";
        keypad(s,"");
    }

    private static void keypad(String s, String ans) {
        if (s.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        int digit = s.charAt(0) - '0';
        String rem = s.substring(1);
        String str = nokia[digit];
        for (int i = 0; i < str.length(); i++) {
            keypad(rem,ans + str.charAt(i));
        }
    }
}
