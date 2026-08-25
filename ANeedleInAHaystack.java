import java.io.*;
import java.util.*;

public class ANeedleInAHaystack {

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

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(tArray);
            HashMap<Character, Integer> sMap = new HashMap<>();
            HashMap<Character, Integer> tMap = new HashMap<>();
            for (Character ch1 : sArray) {
                sMap.put(ch1, sMap.getOrDefault(ch1, 0) + 1);
            }
            for (Character ch2 : tArray) {
                sMap.put(ch2, tMap.getOrDefault(ch2, 0) + 1);
            }
            for (int sKey : sMap.keySet()) {
                if (!(tMap.containsKey(sKey)) || tMap.get(sKey) < sMap.get(sKey)) {
                    out.append("Impossible").append("\n");
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            
        }
        System.out.print(out);
    }
}
