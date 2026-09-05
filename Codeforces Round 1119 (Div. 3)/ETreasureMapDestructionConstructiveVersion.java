import java.io.*;
import java.util.*;

public class ETreasureMapDestructionConstructiveVersion {

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
            int k = sc.nextInt();
            String s = sc.next();
            StringBuilder st = new StringBuilder();
            int cnt = 0;
            for (int i = 0; i < n; i += k) {
                boolean allOne = true;

                for (int j = i; j < i + k; j++) {
                    if (s.charAt(j) == '0') {
                        allOne = false;
                        break;
                    }
                }

                if (allOne) {
                    cnt++;
                }
            }
            out.append(cnt).append("\n");
        }

        System.out.print(out);
    }
}
