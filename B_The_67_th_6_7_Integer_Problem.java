import java.io.*;
import java.util.*;

public class B_The_67_th_6_7_Integer_Problem {

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

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int [] arr = new int[7];
            int large = Integer.MIN_VALUE;
            int sum =0;
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                if (arr[i] > large) {
                    large = arr[i];
                }
            }

            out.append((2*large)-sum).append("\n");
        }

        System.out.print(out);
    }
}
