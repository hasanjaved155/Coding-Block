package leetcode;

public class Guess_Number_Higher_Lower {
    static int pick = 6;
    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }

    private static int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (guess(mid) == 0){
                return mid;
            } else if (guess(mid) == -1) {
                end = mid - 1;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            }
        }
        return 0;
    }

    private static int guess(int mid) {
        if (mid == pick)return 0;
        else if (mid < pick) return 1;
        else return -1;
    }
}
