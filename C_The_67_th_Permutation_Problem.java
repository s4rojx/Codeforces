import java.io.*;
import java.util.*;
public class C_The_67_th_Permutation_Problem {
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
        double nextDouble(){ return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try{ str = br.readLine(); }
            catch(IOException e){e.printStackTrace();}
            return str;
        }
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-->0) {
            int n =sc.nextInt();
            int lrg=3*n;
            int sml=1;
            for (int i= 0;i <n;i++) {
                out.append(sml).append(" ")
                   .append(lrg-1).append(" ")
                   .append(lrg).append(" ");
                lrg -=2;
                sml++; 
            }
            out.append("\n");
        }
        System.out.print(out);
    }
}
