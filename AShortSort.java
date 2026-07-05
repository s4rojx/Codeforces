import java.io.*;
import java.util.*;

public class AShortSort {

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
            String s = sc.nextLine();
            int cnt =0;
            if(s.charAt(0)!='a'){
                cnt ++;
            }
            if(s.charAt(1)!='b')
                cnt++;
            if(s.charAt(2)!='c')
                cnt++;
            if(cnt == 3){
            out.append("NO").append("\n");
            }
            else{
            out.append("YES").append("\n");
            }
        }

        System.out.print(out);
    }
}
