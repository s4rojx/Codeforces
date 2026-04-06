import java.io.*;
import java.util.*;

public class A_Stickogon {

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

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
        HashMap<Integer, Integer> set = new HashMap<>();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                set.merge(arr[i], 1, Integer::sum);
            }
            int sz = 0;
            for(Integer ele : set.values()){
                sz = sz + ele/3;
            }
            out.append(sz).append("\n");
            set.clear();
        }

        System.out.print(out);
    }
}
