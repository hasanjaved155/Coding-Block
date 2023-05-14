package lec37;

import java.util.Stack;

public class Find_Celebrity {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{0,1,0},{1,1,1}};
        int n = 3;
        System.out.println(findCelebrity(n,arr));
    }

    private static int findCelebrity(int n,int[][] arr) {
        Stack<Integer>st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1){
            int a = st.pop();
            int b = st.pop();
            if (knows(a, b,arr) == 1){
                st.push(b);
            }
//            if (arr[a][b] == 1){
//               st.push(b);
//            }
            else {
                st.push(a);
            }
        }
        int candidate = st.pop();
        for (int i = 0; i < n; i++) {
            if (i != candidate && ((knows(i, candidate,arr) != 1) || (knows(candidate,i,arr) == 1))){
                return -1;
            }
//            if (i != candidate && ((arr[i][candidate] == 0) || (arr[candidate][i] == 1))){
//                return -1;
//            }

        }
        return candidate;
    }

    private static int knows(int a, int b,int[][] arr) {
        if (arr[a][b] == 1)return 1;
        else return 0;
    }
}
