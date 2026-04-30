import java.io.*;
import java.util.*;

public class CSnowfall {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st ==null || !st.hasMoreElements()) {
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

        int t =sc.nextInt();

        while (t--> 0) {
            int n =sc.nextInt();
            ArrayList<Integer> mSix =new ArrayList<>();
            ArrayList<Integer> rem =new ArrayList<>();
            ArrayList<Integer> mTwo =new ArrayList<>();
            ArrayList<Integer> mThree =new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int ele= sc.nextInt();
                if (ele%6 ==0)
                    mSix.add(ele);
                else if (ele%3 ==0)
                    mThree.add(ele);
                // else if (ele%4 ==0)
                //     mThree.add(ele);
                
                else if (ele%2 ==0)
                    mTwo.add(ele);
                
                else
                    rem.add(ele);
            }

            for (int ele: mSix)
                out.append(ele+" ");
            for (int ele: mTwo)
                out.append(ele+" ");
            for (int ele: rem)
                out.append(ele+" ");
            for (int ele: mThree)
                out.append(ele+" ");
            out.append("\n");
        }

        System.out.print(out);
    }
}
