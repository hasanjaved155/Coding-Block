package lec25;

public class Jumping {

    public static void main(String[] args) {
        int n = 4;
        jump(0,n,"");
    }

    private static void jump(int start, int end, String ans) {
        if (start == end){
            System.out.println(ans + " ");
            return;
        }
        if (start > end)return;

        jump(start + 1,end,ans + 1);
        jump(start + 2,end,ans + 2);
        jump(start + 3,end,ans + 3);

    }
}
