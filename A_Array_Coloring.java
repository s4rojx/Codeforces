import java.util.Scanner;

public class A_Array_Coloring{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
        
            }
            if(n%2 !=0){
                System.out.println("NO");
            }else{
                int ctr = 0;
            for (int i = 0; i < n; i++) {
                if(i%2 == 0 && a[i]%2 ==0){
                    ctr ++;
                }
            }
            if( ctr == n/2){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            
    }
}
}