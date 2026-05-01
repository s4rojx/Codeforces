import java.io.*;
import java.util.*;

public class DPalindromex {

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

        while (t--> 0) {
            int n =sc.nextInt();
            int m =2*n;
            int[] a = new int[m];

            for (int i =0; i <m;i++) {
                a[i] =sc.nextInt();
            }

            int[] cnt =new int[n];
            int ans =0;
            for (int c = 0; c< m;c++) {
                List<Integer> sn =new ArrayList<>(); // seen before
                cnt[a[c]]++;
                sn.add(a[c]);
                int mex = 0;
                while (mex< n && cnt[mex]> 0) 
                    mex++;
                ans =Math.max(ans, mex);
                int l =c-1,r =c+1;
                while (l>= 0 && r<m && a[l]==a[r]) {
                    cnt[a[l]]++;
                    cnt[a[r]]++;
                    sn.add(a[l]);
                    sn.add(a[r]);
                    while (mex <n && cnt[mex]>0) 
                        mex++;
                    ans =Math.max(ans, mex);
                    l--;
                    r++;
                }
                for(int v :sn) {
                    cnt[v]--;
                }

                if (ans==n) 
                    break;
            }
            if (ans<n) {
                for (int c =0; c< m -1;c++) {
                    if (a[c]!= a[c + 1]) 
                        continue;

                    List<Integer> sn = new ArrayList<>();

                    cnt[a[c]]++;
                    cnt[a[c +1]]++;
                    sn.add(a[c]);
                    sn.add(a[c +1]);

                    int mex = 0;
                    while (mex < n && cnt[mex] >0) mex++;
                    ans = Math.max(ans,mex);
                    int l = c -1, r= c+2;

                    while (l>= 0 && r<m && a[l]==a[r]) {
                        cnt[a[l]]++;
                        cnt[a[r]]++;
                        sn.add(a[l]);
                        sn.add(a[r]);
                        while(mex < n && cnt[mex] > 0) 
                            mex++;
                        ans = Math.max(ans, mex);

                        l--;
                        r++;
                    }
                    for (int v : sn) {
                        cnt[v]--;
                    }
                    if (ans == n) break;
                }
            }
            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
}