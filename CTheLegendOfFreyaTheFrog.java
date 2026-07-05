import java.io.*;
import java.util.*;

public class CTheLegendOfFreyaTheFrog {

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
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();
            long needX = (x + k - 1) / k;
            long needY = (y + k - 1) / k;
            long ans;
            if (needX > needY)
                ans = 2 * needX - 1;
            else
                ans = 2 * needY;

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}
