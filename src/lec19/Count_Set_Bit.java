package lec19;

public class Count_Set_Bit {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(countSet(n));
        System.out.println(fastCountSet(n));
    }
    private static int countSet(int n) {
        int count = 0;
        while(n > 0){
            if ((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    private static int fastCountSet(int n) {
        int count = 0;
        while (n > 0){
            count++;
            n = (n & (n - 1));
        }
        return count;
    }
}
