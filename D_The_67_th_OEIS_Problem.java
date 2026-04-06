import java.io.*;
import java.util.*;

public class D_The_67_th_OEIS_Problem {

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

    static final int max_need =10005;
    static final int lim =150000;
    static long[] primes = new long[max_need];
    static void gPrimes() {
        boolean[] isComposite =new boolean[lim+1];
        for(int i =2;i*i<=lim; i++) {
            if (!isComposite[i]){
                for (int j =i *i; j <=lim;j+= i) {
                    isComposite[j] =true;// defaukt its false
                }
            }
        }

        int flag =0;
        for (int i = 2; i <= lim; i++) {
            if (!isComposite[i]) {
                primes[flag++] = i;
                if (flag == max_need) 
                    break;
            }
        }
    }
    public static void main(String[] args) {
        gPrimes();
        FastScanner sc =new FastScanner();
        StringBuilder out =new StringBuilder();
        int t =sc.nextInt();

        while (t--> 0) {
            int n =sc.nextInt();
            for (int i = 0; i< n;i++) {
                long ans =primes[i]*primes[i +1];
                out.append(ans).append(" ");
            }
            out.append("\n");
        }
        System.out.print(out);
    }
}