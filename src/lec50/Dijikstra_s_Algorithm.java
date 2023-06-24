package lec50;

import lec48_Graph.Graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijikstra_s_Algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijikstra_s_Algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public static void main(String[] args) {
        Dijikstra_s_Algorithm g = new Dijikstra_s_Algorithm(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(6, 7, 3);
        g.addEdge(7, 5, 2);

        //g.display();
        //System.out.println(g.hasPath(1,6,new HashSet<>()));
        //g.allPath(1,6,new HashSet<>(),"");
        //System.out.println(g.bfs(1,6));
        //System.out.println(g.dfs(1, 6));
        g.DijikstraAlgo(1);
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
    public class DijikstraPair{
        int vtx;
        String acqpath;
        int cost;
        public DijikstraPair(int vtx,String acqpath, int cost){
            this.vtx = vtx;
            this.acqpath = acqpath;
            this.cost = cost;
        }
        public String toString(){
            return this.vtx + " " + this.acqpath + "@" + this.cost;
        }
    }

    public void DijikstraAlgo(int src){
        PriorityQueue<DijikstraPair>pq = new PriorityQueue<>(new Comparator<DijikstraPair>() {
            @Override
            public int compare(DijikstraPair o1, DijikstraPair o2) {
                return o1.cost - o2.cost;
            }
        });
        HashSet<Integer>visited = new HashSet<>();
        pq.add(new DijikstraPair(src, "" + src,0));
        while (!pq.isEmpty()){
            // remove
            DijikstraPair rp = pq.remove();
            // ignore
            if (visited.contains(rp.vtx)){
                continue;
            }
            // visited
            visited.add(rp.vtx);
            // selfwork
            System.out.println(rp);
            // add unvisitd nbrs
            for (int nbrs : map.get(rp.vtx).keySet()){
                if (!visited.contains(nbrs)){
                    int cost = map.get(rp.vtx).get(nbrs) + rp.cost;
                    pq.add(new DijikstraPair(nbrs, rp.acqpath + nbrs, cost));
                }
            }
        }
    }
}
