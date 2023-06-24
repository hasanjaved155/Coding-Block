package lec48_Graph;

import java.util.*;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        //g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(6, 7, 3);
        g.addEdge(7, 5, 2);

        //g.display();
        //System.out.println(g.hasPath(1,6,new HashSet<>()));
        //g.allPath(1,6,new HashSet<>(),"");
        //System.out.println(g.bfs(1,6));
        //System.out.println(g.dfs(1, 6));
        //g.bft();
        g.dft();
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean containsVertex(int v1) {
        return map.containsKey(v1);
    }

    public int noOfEdge() {
        int sum = 0;
        for (int key : map.keySet()) {
            sum = sum + map.get(key).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v) {
        for (int nbrs : map.get(v).keySet()) {
            map.get(nbrs).remove(v);
        }
        map.remove(v);
    }

    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public boolean hasPath(int src, int des, HashSet<Integer> visited) {
        if (src == des) return true;

        visited.add(src);

        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, des, visited);
                if (ans) {
                    return ans;
                }
            }
        }
        return false;
    }

    public void allPath(int src, int des, HashSet<Integer> visited, String ans) {
        if (src == des) {
            System.out.println(ans + des);
            return;
        }

        visited.add(src);

        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                allPath(nbrs, des, visited, ans + src + " ");
            }
        }
        visited.remove(src);
    }

    public boolean bfs(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while (!q.isEmpty()) {
            // remove
            int rv = q.poll();
            // ignore if rv already exist in queue
            if (visited.contains(rv)) {
                continue;
            }
            // visited
            visited.add(rv);
            // self work
            if (rv == des) {
                return true;
            }
            // nbrs add krna
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public boolean dfs(int src, int des) {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()) {
            int rv = st.pop();
            if (visited.contains(rv)) {
                continue;
            }
            visited.add(rv);
            if (rv == des) {
                return true;
            }
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    st.push(nbrs);
                }
            }
        }
        return false;
    }

    public void bft() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)){
                continue;
            }
            q.add(src);
            while (!q.isEmpty()) {
                // remove
                int rv = q.poll();
                // ignore if rv already exist in queue
                if (visited.contains(rv)) {
                    continue;
                }
                // visited
                visited.add(rv);
                // self work
                System.out.print(rv + " ");
                // nbrs add krna
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        System.out.println();
    }
    public void dft(){
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)){
                continue;
            }
            st.push(src);
            while (!st.isEmpty()) {
                int rv = st.pop();
                if (visited.contains(rv)) {
                    continue;
                }
                visited.add(rv);
                System.out.print(rv + " ");
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
        }
        System.out.println();
    }
}
