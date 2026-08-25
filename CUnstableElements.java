import java.io.*;
import java.util.*;

public class CUnstableElements {

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
    static int solve(FastScanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i =0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        int m =0;
        int count =1;
        for (int i =1;i<n;i++) {
            if (a[i] == a[i-1]) {
                count++;
            } else {
                temp[m++] =count;
                count = 1;
            }
        }
        temp[m++] =count;
        long[] b =new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = temp[i];
        }
        Arrays.sort(b);
        long[] suf = new long[m+1];
        for (int i = m-1; i>= 0;i--) {
            suf[i] = suf[i+1] + b[i];
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (i == 0 || b[i - 1] < b[i]) {
                long sumSuf =suf[i];
                long rem =m - i;
                long diff = k-sumSuf;

                if (diff % rem == 0) {
                    long D = diff / rem;
                    long mDel = (i == 0) ?0:b[i-1];
                    long R = b[i] - 1;
                    if (Math.max(mDel,-D)<=R) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            out.append(solve(sc)).append("\n");
        }
        System.out.print(out);
    }
}