import java.io.*;
import java.util.*;

public class BOsuMania {

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
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLine();
            }

            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < 4; j++) {
                    char ch = arr[i].charAt(j);
                    if (ch == '#') {
                        out.append(j + 1 + " ");
                        break;
                    }
                }
            }

            out.append("\n");
        }

        System.out.print(out);
    }
}
