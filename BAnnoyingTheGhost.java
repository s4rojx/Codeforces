import java.io.*;
import java.util.*;

public class BAnnoyingTheGhost {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br= new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st== null || !st.hasMoreElements()) {
                try {
                    st= new StringTokenizer(br.readLine());
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
            String str= "";
            try { str= br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }

    public static void main(String[] args) {
        FastScanner sc= new FastScanner();
        StringBuilder out= new StringBuilder();
        int t= sc.nextInt();
        while (t-->0) {
            solve(sc, out);
        }
        System.out.print(out);
    }
    private static void solve(FastScanner sc, StringBuilder out) {
        int n= sc.nextInt();
        int[] a= new int[n];
        int[] b= new int[n];
        for (int i= 0; i< n; i++) {
            a[i]= sc.nextInt();
        }
        for (int i= 0; i< n; i++) {
            b[i]= sc.nextInt();
        }
        int[] used= new int[n];
        int[] tar= new int[n];
        int flag= 1; 
        long p= 0;
        for (int v= 0; v< n; v++) {
            int cur= -1;
            for (int i= 0; i< n; i++) {
                if (used[i]== 0 && a[i]<= b[v]) {
                    cur= i;
                    used[i]= 1;
                    break;
                }
            }
            if (cur== -1) {
                flag= 0;
                break;
            }
            tar[cur]= v;
        }
        if (flag== 0) {
            out.append("-1\n");
            return;
        }
        for (int i= 0; i< n; i++) {
            for (int j= i + 1; j< n; j++) {
                if (tar[i]>tar[j]) {
                    p++;
                }
            }
        }
        
        out.append(p).append("\n");
    }
}