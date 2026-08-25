import java.io.*;
import java.util.*;

public class CDijkstra {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }

    static class Edge {
        int to;
        long weight;
        Edge(int to, long weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int id;
        long dist;
        Node(int id, long dist) {
            this.id = id;
            this.dist = dist;
        }
        public int compareTo(Node o) {
            return Long.compare(this.dist, o.dist);
        }
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Edge>> adj = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long w = sc.nextLong();
            adj.get(u).add(new Edge(v, w));
            adj.get(v).add(new Edge(u, w));
        }

        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        int[] parent = new int[n + 1];

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[1] = 0;
        pq.add(new Node(1, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (cur.dist > dist[cur.id]) continue;

            for (Edge e : adj.get(cur.id)) {
                if (dist[cur.id] + e.weight < dist[e.to]) {
                    dist[e.to] = dist[cur.id] + e.weight;
                    parent[e.to] = cur.id;
                    pq.add(new Node(e.to, dist[e.to]));
                }
            }
        }

        if (dist[n] == Long.MAX_VALUE) {
            System.out.println("-1");
        } else {
            List<Integer> path = new ArrayList<>();
            for (int v = n; v != 0; v = parent[v]) {
                path.add(v);
            }
            Collections.reverse(path);
            StringBuilder out = new StringBuilder();
            for (int v : path) {
                out.append(v).append(" ");
            }
            System.out.println(out.toString().trim());
        }
    }
}