import java.io.*;
import java.util.*;

public class AEuclidSequenceAndTwoNumbers {

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
            Integer[] arr = new Integer[n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            for (int i = 2; i < n; i++) {
                if (arr[i] != arr[i - 2] % arr[i - 1]) {
                    k = 1;
                    break;
                }
            }
            if (k != 1) {
                out.append(arr[0] + " " + arr[1]);
            } else
                out.append(-1);
            out.append("\n");
        }

        System.out.print(out);
    }
}
