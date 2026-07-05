import java.io.*;
import java.util.*;

public class CCostOfABracketSequence {

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
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next(); 
            char[] seq = s.toCharArray();
            int[] oIdx = new int[n];
            int top = 0;
            
            int[] opn = new int[n];
            int[] cls = new int[n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (seq[i] == '(') {
                    oIdx[top++] = i;
                } else {
                    if (top != 0) {
                        opn[cnt] = oIdx[--top];
                        cls[cnt] = i;
                        cnt++;
                    }
                }
            }
            int lowUm = (top == 0) ? n : oIdx[0];
            int[] rmv = new int[n];
            int tar = 0;
            for (int i = 0; i < cnt; i++) {
                if (opn[i] >= lowUm) {
                    rmv[tar++] = cls[i]; 
                } else {
                    rmv[tar++] = opn[i]; 
                }
            }
            char[] ans = new char[n];
            Arrays.fill(ans, '0');
            int op = Math.min(k, tar);
            for (int i = 0; i < op; i++) {
                ans[rmv[i]] = '1';
            }
            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
}
