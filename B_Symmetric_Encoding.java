import java.io.*;
import java.util.*;

public class B_Symmetric_Encoding {

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
            sc.nextLine();
            String b = sc.nextLine();
            char [] letter = b.toCharArray();
            Arrays.sort(letter);
            Set<Character> set = new HashSet<>();
            for(Character ch : letter){
                set.add(ch);
            }
            char [] encodings = new char[set.size()];
            int j = 0;
            for(Character ch:set){
                encodings[j++] = ch;
            }
            String ans ="";
            for (int i = 0; i < n; i++) {
                
            }
        }

        System.out.print(out);
    }
}
