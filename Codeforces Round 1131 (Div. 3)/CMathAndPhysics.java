import java.io.*;
import java.util.*;

public class CMathAndPhysics {

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

            boolean has = false;
            boolean interior = false;
            boolean edge = false;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                sum += a;

                if (a >= 2)
                    if (i > 0 && i < n - 1) {
                        interior = true;
                    } else {
                        edge = true;
                    }
            }
            if (interior) {
                out.append(sum - 1).append("\n");
            } else if (edge) {

                out.append(sum - n + 1).append("\n");
            } else {
                out.append(-1).append("\n");
            }
        }

        System.out.print(out);
    }
}
