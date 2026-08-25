import java.io.*;
import java.util.*;

public class AOlympiadDate {

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

            int zero = 0, one = 0, two = 0, three = 0, five = 0;
            boolean found = false;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 0)
                    zero++;
                else if (x == 1)
                    one++;
                else if (x == 2)
                    two++;
                else if (x == 3)
                    three++;
                else if (x == 5)
                    five++;

                if (!found &&
                        zero >= 3 &&
                        one >= 1 &&
                        two >= 2 &&
                        three >= 1 &&
                        five >= 1) {
                    out.append(i + 1).append("\n");
                    found = true;
                }
            }

            if (!found)
                out.append(0).append("\n");
        }

        System.out.print(out);
    }
}
