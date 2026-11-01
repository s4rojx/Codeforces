import java.io.*;
import java.util.*;

public class AFractionAndSix {

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
            int m = sc.nextInt();
            String numerator = sc.next();
            String denominator = sc.next();
            HashMap<Character, Integer> nMap = new HashMap<>();

            if (n - m != 3) {
                out.append("NO").append("\n");
                continue;
            } else {
                if (n - m != 3) {
    out.append("NO\n");
    continue;
}

for (char ch : numerator.toCharArray()) {
    nMap.put(ch, nMap.getOrDefault(ch, 0) + 1);
}

for (char ch : denominator.toCharArray()) {
    if (nMap.containsKey(ch)) {
        nMap.put(ch, nMap.get(ch) - 1);

        if (nMap.get(ch) == 0) {
            nMap.remove(ch);
        }
    }
}
                if (nMap.size() == 3 &&
                        nMap.getOrDefault('s', 0) == 1 &&
                        nMap.getOrDefault('i', 0) == 1 &&
                        nMap.getOrDefault('x', 0) == 1) {
                    out.append("YES").append("\n");
                } else {
                    out.append("NO").append("\n");
                }
            }
        }
        System.out.print(out);
    }
}
