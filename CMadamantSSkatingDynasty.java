import java.io.*;
import java.util.*;

public class CMadamantSSkatingDynasty {

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

    static long mod = 998244353;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
            if (n == 1) {
                out.append(0).append("\n");
                continue;
            }
            long[] suf = new long[n];
            suf[n - 1] = a[n - 1] % mod;
            for (int i = n - 2; i >= 0; i--) {
                suf[i] = ((suf[i + 1] + a[i]) % mod);
            }
            for (int i = 0; i < n - 1; i++) {
                long rem = n - 1 - i;
                long inv = pw(rem, mod - 2);
                long p = (suf[i + 1] * inv) % mod;
                long curr = a[i] % mod;
                long diff = (p - curr + mod) % mod;
                sum = (sum + diff) % mod;
            }
            long f = 1;
            for (int i = 1; i < n; i++) {
                f = (f * i) % mod;
            }
            long ans = (sum * f) % mod;
            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
    static long pw(long a, long b) {
        long r = 1;
        a %= mod;
        while (b > 0) {
            if (b % 2 != 0)
                r = (r * a) % mod;
            a = (a * a) % mod;
            b /= 2;
        }
        return r;
    }
}