package lec49;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MST_Minimum_Spanning_Tree_Prims_Algorithm {
    HashMap<Integer, HashMap<Integer, Integer>>map;
    public MST_Minimum_Spanning_Tree_Prims_Algorithm(int v){
        this.map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
    public class PrimsPair{
        int vtx;
        int acqvtx;
        int cost;
        public PrimsPair(int vtx, int acqvtx, int cost){
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }
        public String toString(){
            return this.vtx + " " + this.acqvtx + " @ " + this.cost;
        }

    }
    public void primsAlgo(){
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost - o2.cost;
            }
        });
        HashSet<Integer>visited = new HashSet<>();
        pq.add(new PrimsPair(1,1,0));
        while (!pq.isEmpty()){
            PrimsPair rp = pq.poll();
            if (visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
            System.out.println(rp);
            for (int nbrs : map.get(rp.vtx).keySet()){
                if (!visited.contains(nbrs)){
                    int newcost = map.get(rp.vtx).get(nbrs);
                    pq.add(new PrimsPair(nbrs,rp.vtx,newcost));
                }
            }
        }
    }

    public static void main(String[] args) {
        MST_Minimum_Spanning_Tree_Prims_Algorithm g = new MST_Minimum_Spanning_Tree_Prims_Algorithm(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(6, 7, 3);
        g.addEdge(7, 5, 2);
        g.primsAlgo();
    }
}
