import java.io.*;
import java.util.*;

public class BStakesAndShapes {

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
            int r = sc.nextInt();
            int s = sc.nextInt();
            int p = sc.nextInt();
            int n = r + s + p;
            
            char move;
            if (s >= p) {
                move = 'R';
            } else if (p >= r) {
                move = 'S';
            } else {
                move = 'P';
            }
            for (int i = 0; i < n; i++) {
                out.append(move);
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}
