package practise;

public class Murthal_Parantha {
    public static void main(String[] args) {
        int p = 10;
        int l = 4;
        int[] rank = {1,2,3,4};
        System.out.println(murthal_Parantha(p,l,rank));
    }

    private static int murthal_Parantha(int p, int l, int[] rank) {
        int start = -1;
        int end = Integer.MAX_VALUE;
        int ans = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if (isPossibleParantha(mid,p,l,rank)){
                ans = mid;
                end = mid - 1;
            }else start = mid + 1;
        }
        return ans;
    }
    private static boolean isPossibleParantha(int mid, int p, int l, int[] rank) {
        int countRank = 1;
        int timeTaken = 0;
        int totalParantha = 0;
        int i = 0;
        while (i < l){
            if (timeTaken + countRank * rank[i] <= mid){
                timeTaken+= countRank * rank[i];
                totalParantha++;
                countRank++;
            }else {
                i++;
                countRank = 1;
                timeTaken = 0;
            }
            if (totalParantha >= p)return true;
        }
        return false;
    }
}
