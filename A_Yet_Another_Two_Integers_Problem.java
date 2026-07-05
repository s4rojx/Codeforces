import java.util.*;
public class A_Yet_Another_Two_Integers_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = Math.abs(a-b);
            if(a==b){
                System.out.println(0);
            }
            else if(a%10==0&&b%10==0){
                System.out.println(c/10);
            }
            else{
                System.out.println((c/10)+1);
            }
            
        }
    }
}