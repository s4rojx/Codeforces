import java.io.*;
import java.util.*;

public class BDifferentDistances {

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
            if (n == 2) {
                out.append("1 2 1 2 2 1 1 2\n");
                continue;
            }
            for (int i = 1; i <= n; i++) {
                out.append(i).append(" ").append(i).append(" ");
            }
            for (int i = 1; i <= n - 2; i++) {
                out.append(i).append(" ");
            }
            out.append(n).append(" ").append(n - 1).append(" ");
            for (int i = 1; i <= n; i++) {
            out.append(i).append(" ");
        }
        out.append("\n");
        }
        System.out.print(out);
    }
}
