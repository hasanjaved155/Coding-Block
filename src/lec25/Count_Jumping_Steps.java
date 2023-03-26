package lec25;

public class Count_Jumping_Steps {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("\n"+jump(0,n,""));
//        int ans = jump(0,n,"");
//        System.out.println();
//        System.out.println(ans);
    }

    private static int jump(int start, int end, String ans) {
        if (start == end){
            System.out.print(ans + " ");
            return 1;
        }
        if (start > end)return 0;

        int j1 = jump(start + 1,end,ans + 1);
        int j2 = jump(start + 2,end,ans + 2);
        int j3 = jump(start + 3,end,ans + 3);
        return j1 + j2 + j3;
    }
}
