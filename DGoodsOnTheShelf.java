import java.io.*;
import java.util.*;

public class DGoodsOnTheShelf {

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
        while (t-- > 0) {int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0;i <n;i++) {
                a[i] =sc.nextInt();
            }
            if(check(a,n)) {
                out.append("YES\n");
                continue;
            }
            boolean ok =false;
            for (int i = n-1;i>=0;i--) {
                for (int j = i-1;j>=0;j--) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    if (check(a,n)) {
                        ok=true;
                        break;
                    }
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                if(ok) 
                  break;
            }
            if (ok) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }
        System.out.print(out);
    }
    private static boolean check(int[] arr,int n) {
        Set<Integer> set=new HashSet<>();
        int prev=arr[0];
        set.add(prev);
        for (int i=1;i<n;i++) {
            if (arr[i]!=prev) {
                if (set.contains(arr[i])) {
                    return false;
                }
                set.add(arr[i]);
                prev=arr[i];
            }
        }
        return true;
    }
}