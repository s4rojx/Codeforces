    import java.io.*;
    import java.util.*;

    public class BPalindromeTwelveAndTwoTerms {

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
            long t = sc.nextLong();
            while (t-- > 0) {
                long n = sc.nextLong();
                if (n == 10) {
                    out.append("-1\n");
                    continue;
                }
                long a = n % 12;
                while (!isPalindrome(a)) {
                    a += 12;
                }
                long b = n-a;
                out.append(a).append(" ").append(b).append("\n");
            }

            System.out.print(out);
        }
        static boolean isPalindrome(long n) {
            long temp = n, rev = 0;
            while (temp > 0) {
                long k = temp % 10;
                rev = (rev * 10) + k;
                temp = temp / 10;
            }
            return rev == n;
        }
    }
