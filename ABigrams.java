import java.io.*;
import java.util.*;

public class ABigrams {

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
    static boolean solve(FastScanner sc) {
        int k = sc.nextInt();
        boolean flag = false;
        int pair = 0;

        for (int i = 0;i< k; i++) {
            int c = sc.nextInt();
            if (c>= 3) {
                flag = true;
            }
            if (c>= 2) {
                pair++;
            }
        }
        if (flag || pair>=2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        StringBuilder out =new StringBuilder();
        int t =sc.nextInt();
        while (t-->0) {
            if (solve(sc)) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }
        System.out.print(out);
    }
}