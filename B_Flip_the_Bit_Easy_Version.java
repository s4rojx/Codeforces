import java.io.*;
import java.util.*;

public class B_Flip_the_Bit_Easy_Version {

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
        int t =sc.nextInt();

        while(t-- > 0) {
            int n =sc.nextInt();
            int k =sc.nextInt();

            int[] a=new int[n];
            for (int i= 0;i <n;i++) {
                a[i] =sc.nextInt();
            }
            int p =sc.nextInt() - 1;

            int lFlips =lCount(a,p);
            int rFlips = rCount(a,p,n);
            int ans=Math.max(lFlips,rFlips);

            if (ans%2!=0) {
                ans++;
            }
            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
    static int lCount(int[] a, int p) {
        int ans= 0;
        for (int i = 0; i < p; i++) {
            if (a[i] != a[i + 1]) {
                ans++;
            }
        }
        return ans;
    }

    static int rCount(int[] a, int p, int n) {
        int ans = 0;
        for (int i = n - 1; i > p; i--) {
            if (a[i] != a[i - 1]) {
                ans++;
            }
        }
        return ans;
    }
}
