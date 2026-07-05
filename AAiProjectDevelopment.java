import java.io.*;
import java.util.*;

public class AAiProjectDevelopment {

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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            out.append(solve(n, x, y, z)).append("\n");
        }

        System.out.print(out);
    }

    public static int solve(int n, int x, int y, int z) {
        int comb = x + y;
        int nAI = (n + comb - 1) / comb;
        int ai = 0;
        int maxim = z * x;
        if (maxim >= n) {
            ai = (n + x - 1) / x;
        } else {
            int p = n - maxim;
            int aiMaxim = x + 10 * y;
            int total = (p + aiMaxim - 1) / aiMaxim;
            ai = z + total;
        }

        return Math.min(nAI, ai);
    }
}
