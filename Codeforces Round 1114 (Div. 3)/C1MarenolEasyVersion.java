import java.io.*;
import java.util.*;

public class C1MarenolEasyVersion {
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
            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();
            //0-even 1-odd
            int[] aCount = new int[2];
            int[] bCount = new int[2];
            for (int i = 0; i < n; i++) {
                if (((i & 1) == 0)) {//even indx
                    if (a[i] == '0') {
                        aCount[0]++;
                    }
                    if (b[i] == '0') {
                        bCount[0]++;
                    }
                } else {//odd
                    if (a[i] == '0') {
                        aCount[1]++;
                    }
                    if (b[i] == '0') {
                        bCount[1]++;
                    }
                }
            }
            String ans = (aCount[0] == bCount[0] && aCount[1] == bCount[1]) ? "YES" : "NO";
            ;
            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
}
