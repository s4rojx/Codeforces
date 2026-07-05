import java.io.*;
import java.util.*;

public class C2SeatingArrangementHardVersion {

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
            int s = sc.nextInt();
            String u = sc.next();
            solve(n, x, s, u, out);
        }

        System.out.print(out);
    }

    public static void solve(int n, int x, int s, String u, StringBuilder out) {
        int tbl = 0;
        long seats = 0;
        int aFlip = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char c = u.charAt(i);
            if (c == 'I') {
                if (tbl < x) {
                    tbl++;
                    seats += (s - 1);
                    ans++;
                }
            } else if (c == 'E') {
                if (seats > 0) {
                    seats--;
                    ans++;
                } else if (aFlip > 0 && tbl < x) {
                    aFlip--;
                    tbl++;
                    seats += (s - 1);
                    ans++;
                }
            } else if (c == 'A') {
                if (seats > 0) {
                    seats--;
                    aFlip++;
                    ans++;
                } else if (tbl < x) {
                    tbl++;
                    seats += (s - 1);
                    ans++;
                }
            }
        }

        out.append(ans).append("\n");
    }
}
