import java.io.*;
import java.util.*;
public class BPredominantFrequencyDivision {
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
    static boolean solve(FastScanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        if (n<3)
            return false;
        int[] mSum = new int[n];
        if (a[n - 2] <= 2) {
            mSum[n - 2] =1;
        } else {
            mSum[n - 2] =-1;
        }
        for (int i=n-3;i>=1;i--) {
            int val =0;
            if(a[i]<=2){
                val=1;
            }
            else{
                val=-1;
            }
            mSum[i] =val+Math.max(0,mSum[i + 1]);
        }
        int p1 = 0;
        for (int i = 0;i <=n-3;i++) {
            if(a[i] == 1){
               p1 += 1; 
            }else{
                p1 += -1;
            }
            if (p1>=0 && mSum[i+1]>=0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            if (solve(sc)) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }
        System.out.print(out);
    }
}