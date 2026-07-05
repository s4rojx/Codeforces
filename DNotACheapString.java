import java.io.*;
import java.util.*;

public class DNotACheapString {

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
            String s = sc.next();
            int p = sc.nextInt();
            char[] w = s.toCharArray();
            Arrays.sort(w);
            for (int i = 0, j = w.length - 1; i < j; i++, j--) {
                char temp = w[i];
                w[i] = w[j];
                w[j] = temp;
            }
            int cost = 0;
            for (int i = 0; i < s.length(); i++) {
                cost += s.charAt(i) - 'a' + 1;
            }
            Map<Character, Integer> del = new HashMap<>();
            for (int i = 0; i < w.length; i++) {
                if (cost > p) {
                    del.put(w[i], del.getOrDefault(w[i], 0) + 1);
                    cost -= w[i] - 'a' + 1;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (del.getOrDefault(c, 0) > 0) {
                    del.put(c, del.get(c) - 1);
                    continue;
                }

                out.append(c);
            }

            out.append('\n');
        }
        System.out.print(out);
    }
}
