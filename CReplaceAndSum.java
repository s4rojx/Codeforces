import java.io.*;
import java.util.*;

public class CReplaceAndSum {

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
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            long[] c = new long[n];
            for (int i = 0; i < n; i++) {
                c[i] = Math.max(a[i], b[i]);
            }
            for (int i = n - 2; i >= 0; i--) {
                c[i] = Math.max(c[i], c[i + 1]);
            }
            long[] pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + c[i];
            }
            
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long ans = pref[r] - pref[l - 1];
                out.append(ans).append(" ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}