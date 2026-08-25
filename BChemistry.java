import java.io.*;
import java.util.*;

public class BChemistry {

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
            int k = sc.nextInt();// no to delete
            String s = sc.next();

            out.append(n).append("\n");
        }

        System.out.print(out);
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int evenCntr = 0;
        int oddCntr = 0;
        if ((length & 1) == 0) {
            for (int key : map.keySet()) {
                if ((map.get(key)) % 2 != 0) {
                    return false;
                } else {
                    evenCntr++;
                }
            }
            return true;
        } else {
            for (int key : map.keySet()) {
                if ((map.get(key) % 2) != 0) {
                    evenCntr++;
                }else{
                    
                }
            }
        }
    }
}
