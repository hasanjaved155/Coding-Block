package lec50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bellman_Ford_Algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Bellman_Ford_Algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public static void main(String[] args) {
        Bellman_Ford_Algorithm g = new Bellman_Ford_Algorithm(5);
        g.addEdge(1, 2, 8);
        g.addEdge(2, 5, -2);
        g.addEdge(5,2,1);
        g.addEdge(4, 5, 4);
        g.addEdge(3, 4, -3);
        g.addEdge(1, 3, 4);
        g.addEdge(1, 4, 5);

        //g.display();
        //System.out.println(g.hasPath(1,6,new HashSet<>()));
        //g.allPath(1,6,new HashSet<>(),"");
        //System.out.println(g.bfs(1,6));
        //System.out.println(g.dfs(1, 6));
        g.bellManFord();
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
    }
    public class EdgeList{
        int v1;
        int v2;
        int cost;
        public EdgeList(int v1, int v2, int cost){
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
    }
    public List<EdgeList> getAllEdges(){
        List<EdgeList>ll = new ArrayList<>();
        for (int v1 : map.keySet()){
            for (int v2 : map.get(v1).keySet()){
                int cost = map.get(v1).get(v2);
                ll.add(new EdgeList(v1, v2, cost));
            }
        }
        return ll;
    }
    public void bellManFord(){
        List<EdgeList>ll = getAllEdges();
        int v = map.size();
        int[] arr = new int[v + 1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = 10000000;
        }
        for (int i = 1; i <= v; i++) {
            for (EdgeList e : ll){
                if (i == v && arr[e.v2] > arr[e.v1] + e.cost){
                    System.out.println("-ve weight ka cycle hai");
                    return;
                }
                if (arr[e.v2] > arr[e.v1] + e.cost){
                    arr[e.v2] = arr[e.v1] + e.cost;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
