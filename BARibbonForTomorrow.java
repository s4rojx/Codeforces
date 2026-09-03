import java.io.*;
import java.util.*;

public class BARibbonForTomorrow {

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
    }

    static final long MOD = 998244353;
    static final int MAX = 1000005;
    static long[] fact = new long[MAX];
    static long[] invFact = new long[MAX];

    static void calc() {
        fact[0] = 1;
        invFact[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        invFact[MAX - 1] = power(fact[MAX - 1], MOD - 2);
        for (int i = MAX - 2; i >= 1; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }

    static long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) != 0)
                res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }

    static long nCr(int n, int r) {
        if (r < 0 || r > n)
            return 0;
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    public static void main(String[] args) {
        calc();
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (n == 1) {
                out.append(1).append("\n");
                continue;
            }

            int k = 0;
            int E = 0, O = 0;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    k++;
                } else {
                    if (k % 2 == 0) {
                        E++;
                    } else {
                        O++;
                    }
                }
            }

            int Ne = (k / 2) + 1;
            int No = (k + 1) / 2;

            long p = 1, q = 1;

            if (Ne > 0) {
                p = nCr(E + Ne - 1, Ne - 1);
            }
            if (No > 0) {
                q = nCr(O + No - 1, No - 1);
            }

            long ans = (p * q) % MOD;
            out.append(ans).append("\n");
        }

        System.out.print(out);
    }
}