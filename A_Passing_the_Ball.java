import java.util.Scanner;

public class A_Passing_the_Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
String s = sc.next();
            int flag = 1;
            for (int i = 1; i < s.length(); i++) {
                char ch = s.charAt(i);
                flag ++;
                if(ch == 'L'){
                    break;
                }
            }
            System.out.println(flag);
        }
    }
}
