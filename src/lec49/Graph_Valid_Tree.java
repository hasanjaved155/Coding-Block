package lec49;

import java.util.*;

public class Graph_Valid_Tree {
    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {3, 4}};

        System.out.println(validTree(n, edges));
    }

    private static boolean validTree(int n, int[][] edges) {
        HashMap<Integer, List<Integer>>map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new LinkedList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return isValid(map);
    }
    public static boolean isValid(HashMap<Integer,List<Integer>>map){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;
        for (int src : map.keySet()) {
            if (visited.contains(src)){
                continue;
            }
            count++;
            q.add(src);
            while (!q.isEmpty()) {
                // remove
                int rv = q.poll();
                // ignore if rv already exist in queue
                if (visited.contains(rv)) {
                    return false;
                }
                // visited
                visited.add(rv);
                // self work
                // nbrs add krna
                for (int nbrs : map.get(rv)) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        return count == 1;
    }
}
