import java.io.*;
import java.util.*;

public class CChipmunkTheoAndEquality {
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
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            solve(n, arr, out);
        }
        System.out.print(out);
    }
    public static void solve(int n, int[] a, StringBuilder out) {
        long[] p = new long[n * 100];
        int sz = 0;
        for (int i = 0; i < n; i++) {
            int cur = a[i];
            int d = 0;
            while (true) {
                p[sz++] = ((long) cur << 32) | (long) d;
                if (cur == 1) {
                    if (d == 0) {
                        p[sz++] = (2L << 32) | 1L;
                    }
                    break;
                }
                d++;
                if (cur % 2 == 0) {
                    cur /= 2;
                } else {
                    cur += 1;
                }
            }
        }
        Arrays.sort(p, 0, sz);
        long ans = Long.MAX_VALUE;
        int i = 0;
        while (i < sz) {
            long val = p[i] >>> 32;
            int cnt = 0;
            long cost = 0;
            while (i < sz && (p[i] >>> 32) == val) {
                cnt++;
                cost += (p[i] & 0xFFFFFFFFL);
                i++;
            }
            if (cnt == n) {
                ans = Math.min(ans, cost);
            }
        }
        out.append(ans).append("\n");
    }
}