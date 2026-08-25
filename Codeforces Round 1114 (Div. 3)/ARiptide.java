import java.io.*;
import java.util.*;

public class ARiptide {

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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == b || b == c || a == c) {
                out.append(0).append("\n");
                continue;
            }
            int min = Math.min(a, Math.min(b, c));
            int max = Math.max(a, Math.max(b, c));
            int mid = (a + b + c) - min - max;
            int maxMidDf = max - mid;
            int minMidDf = mid - min;

            out.append(Math.min(maxMidDf, minMidDf)).append("\n");
        }
        System.out.print(out);
    }
}