import java.io.*;
import java.util.*;

public class DStaircase {
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
            long total = 0;
            long cSum = 0;
            long odd = 0;
            int cLen = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                if (a > 0) {
                    cLen++;
                    cSum += a;
                    if (cLen % 2 != 0) {
                        odd = Math.max(odd, a);
                    }
                } else {
                    if (cLen > 0) {
                        if (cLen % 2 == 0) {
                            total += 2 * cSum;
                        } else {
                            total += 2 * cSum - odd;
                        }
                        cLen = 0;
                        cSum = 0;
                        odd = 0;
                    }
                }
            }
            if (cLen > 0) {
                if (cLen % 2 == 0) {
                    total += 2 * cSum;
                } else {
                    total += 2 * cSum - odd;
                }
            }
            out.append(total).append("\n");
        }
        System.out.print(out);
    }
}