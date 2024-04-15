import java.util.*;
public class JPA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Input n (0<=n<=16):");
            n = s.nextInt();
            if (n==999) {
                break;
            }
            long f = 1;
            for (int i = 2; i <=n; i++){
                f *= i;
            }
            System.out.println(n+"的階乘 = "+f);
        }
        
    }
}
