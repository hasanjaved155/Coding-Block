package lec49;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
class Pair {
    int vtx;
    int lv;

    public Pair(int vtx, int lv) {
        this.vtx = vtx;
        this.lv = lv;
    }
}
public class Is_Bipartite_Graph {
    public static void main(String[] args) {
         Is_Bipartite_Graph g = new Is_Bipartite_Graph();
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(g.isBipartite(graph));
    }
    public boolean isBipartite(int[][] graph) {
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int src = 0; src < graph.length; src++) {
            if (visited.containsKey(src)){
                continue;
            }
            q.add(new Pair(src, 0));
            while (!q.isEmpty()) {
                // remove
                Pair rv = q.poll();
                // ignore if rv already exist in queue
                if (visited.containsKey(rv.vtx)) {
                    if (visited.get(rv.vtx) != rv.lv){
                        return false;
                    }
                    continue;
                }
                // visited
                visited.put(rv.vtx, rv.lv);
                // nbrs add krna
                for (int nbrs : graph[rv.vtx]) {
                    if (!visited.containsKey(nbrs)) {
                        q.add(new Pair(nbrs, rv.lv + 1));
                    }
                }
            }
        }
       return true;
    }
}
