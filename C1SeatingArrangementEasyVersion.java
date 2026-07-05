import java.io.*;
import java.util.*;

public class C1SeatingArrangementEasyVersion {
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
            int x = sc.nextInt();
            int s = sc.nextInt();
            String u = sc.nextLine();
            solve(n,x,s,u,out);
        }
        System.out.print(out);
    }
    public static void solve(int n, int x, int s, String u, StringBuilder out) {
        int[][] dp = new int[n + 1][x + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -2);
        }
        int res = 0;
        for (int j = 0; j <= x; j++) {
            res = Math.max(res, seat(n, j, s, u, dp));
        }
        out.append(res).append("\n");
    }
    private static int seat(int i, int j, int s, String u, int[][] dp) {
        //base casse
        if (j < 0) 
            return -1;
        if (i == 0) 
            return j == 0 ? 0 : -1;
        
        if (dp[i][j] != -2) 
            return dp[i][j];
        // recurse
        int ans = seat(i - 1, j, s, u, dp);
        char c =u.charAt(i-1);
        if (c =='I' || c=='A') {
            int p =seat(i - 1, j - 1, s, u, dp);
            //memoize..
            if (p!=-1) {
                ans = Math.max(ans, p + 1);
            }
        }
        if (c == 'E' || c == 'A') {
            int p = seat(i-1, j, s, u, dp);
            if (p != -1 && p < j*s) {
                ans =Math.max(ans, p + 1);
            }
        }

        return dp[i][j] = ans;
    }
}
