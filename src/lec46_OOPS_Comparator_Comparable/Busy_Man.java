package lec46_OOPS_Comparator_Comparable;

import java.util.*;

public class Busy_Man {
    static class Pair{
        int start;
        int end;
        public Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            //Pair[] arr = new Pair[n];
            List<Pair> ll = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int start =  scanner.nextInt();
                int end = scanner.nextInt();
                //arr[j] = new Pair(start,end);
                ll.add(new Pair(start,end));
            }
            Collections.sort(ll, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.end - o2.end;
                }
            });
         int activities = 1;
         //int end = arr[0].end;
            int end = ll.get(0).end;
            for (int j = 1; j < ll.size(); j++) {
                if (end <= ll.get(j).start){
                    activities++;
                    end = ll.get(j).end;
                }
            }
            System.out.println(activities);
        }
    }
}
