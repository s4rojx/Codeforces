    import java.io.*;
    import java.util.*;

    public class DDrAgosSDarkMode {

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
            while(t-->0) {
                int px = sc.nextInt();
                char[] s = new char[px];
                for(int i = 0; i < px; i++) {
                    if((px % 2)!=0) {
                        s[i] =(i%2 == 0)?'1':'0';
                    } else{
                        s[i] =(i%2!=0)?'1':'0';
                    }
                }
                if (px %2==0){
                    if (px<=2){
                        s[0] ='1';
                    }
                    if (px >=6){
                        s[px-1]='0';
                    }
                }
                out.append(new String(s)).append("\n");
            }
            System.out.print(out);
        }
        static long pw(long a, long b) {
        long r = 1;
        a %= mod;
        while (b > 0) {
            if (b % 2 != 0)
                r = (r * a) % mod;
            a = (a * a) % mod;
            b /= 2;
        }
        return r;
    }
    }