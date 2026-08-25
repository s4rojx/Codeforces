import java.io.*;
import java.util.*;

public class AOptimalPurchase {

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

    public static void solve(long n, long a, long b) {
        long total = 0L;
        if (3 * a <= b) {
            System.out.println(a * n);
            return;
        }
        long group = n / 3;
        long rem = n % 3;
        long bCont = b * group;
        if (rem == 0) {
            System.out.println(bCont);
            return;
        } else {
            long aCont = rem * a;
            total = Math.min(aCont, b) + bCont;
            System.out.println(total);
            return;
        }

    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            solve(n, a, b);
        }

        System.out.print(out);
    }
}
