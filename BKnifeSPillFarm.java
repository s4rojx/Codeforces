import java.io.*;
import java.util.*;

public class BKnifeSPillFarm {

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
            int m = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            PriorityQueue<Long> q = new PriorityQueue<>(Collections.reverseOrder());
            long sum = 0;
            long ans = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (i >= m - 1) {
                    long current = (long) m * a[i] - sum;
                    if (current > ans) {
                        ans = current;
                    }
                }
                if (m > 1) {
                    q.add(a[i]);
                    sum += a[i];
                    if (q.size() > m - 1) {
                        sum -= q.poll();
                    }
                }
            }
            out.append(ans).append("\n");
        }

        System.out.print(out);
    }
}