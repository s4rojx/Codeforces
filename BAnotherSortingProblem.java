import java.io.*;
import java.util.*;

public class BAnotherSortingProblem {

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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            solve(n,arr,out);
        }
        System.out.print(out);
    }
    public static void solve(int n,int[] a, StringBuilder out) {
        int k =0;
        for (int i=0;i<n-1;i++) {
            if (a[i]>a[i+1]) {
                k =Math.max(k,a[i]-a[i +1]);
            }
        }
        boolean pl =true;
        boolean pa =true;
        for (int i = 0; i < n - 1; i++) {
            boolean cl = false,ca =false;
            if (a[i] > a[i + 1]) {
                if (pl){
                    ca =true;
                }
            } else {
                if (pl){
                    cl =true;
                    ca =true;
                }
                if (pa){
                    ca=true;
                    //a[i-1]>=k+a[i]
                    if(a[i+1] -a[i]>= k) {
                    cl = true;
                    }
                }
            }
            pl = cl;pa =ca;
            if (!pl && !pa) {
                out.append("NO\n");
                return;
            }
        }
        out.append("YES\n");
    }
}
