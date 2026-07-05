import java.io.*;
import java.util.*;

public class BCakeLeveling {
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(n, a, out);
        }
        System.out.print(out);
    }

    public static void solve(int n, int[] a, StringBuilder out) {
        long sml = Long.MAX_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            long lrg = sum / (i + 1);
            if (lrg < sml) {
                sml = lrg;
            }
            out.append(sml).append(" ");
        }
        out.append("\n");
    }
}
