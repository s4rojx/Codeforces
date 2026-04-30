import java.io.*;
import java.util.*;

public class BPartyMonster {

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
            String s = sc.next();

            if (n % 2 != 0) {
                out.append("NO").append("\n");
                continue;
            }
            int oCnt = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    oCnt++;
                }
            }
            if (oCnt != n / 2) {
                out.append("NO").append("\n");
            } else
                out.append("YES").append("\n");
        }

        System.out.print(out);
    }
}
