import java.io.*;
import java.util.*;

public class BRemovalsGame {

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

    public static StringBuilder revString(String s) {
        StringBuilder rev = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }

        return rev;
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] alice = new int[n];
            int[] bob = new int[n];
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                alice[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                bob[i] = sc.nextInt();
            }
            boolean isSame = true;
            boolean isReverse = true;
            for (int i = 0; i < n; i++) {
                if (alice[i] != bob[i]) {
                    isSame = false;
                }
                if (alice[i] != bob[n - 1 - i]) {
                    isReverse = false;
                }
            }

            if (isSame || isReverse) {
                out.append("Bob").append("\n");
            } else {
                out.append("Alice").append("\n");
            }

        }

        System.out.print(out);
    }
}
