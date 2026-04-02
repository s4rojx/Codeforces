import java.io.*;
import java.util.*;

public class A_Translation {

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
        String s = sc.nextLine();
        String t = sc.nextLine();
        String reversedS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedS += s.charAt(i);
        }
        if (t.equals(reversedS)) {
            out.append("YES").append("\n");
        } else {
            out.append("NO").append("\n");
        }

        System.out.print(out);
    }
}
