import java.io.*;
import java.util.*;

public class ARumbNeedsAHand {

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
            
            boolean yes = true;
            int[] a = new int[n + 1];
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                if (a[i] != i) {
                    list.add(i);
                }
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a[list.get(i)] != list.get(size - 1 - i)) {
                    yes = false;
                    break;
                }
            }

            out.append(yes ? "YES\n" : "NO\n");
        }

        System.out.print(out);
    }
}
