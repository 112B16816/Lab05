import java.util.Scanner;

public class JPA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int gcd = 1;
            System.out.print("Input m :");
            int m = scanner.nextInt();
            if (m==999) {
                break;
            }
            System.out.print("Input n :");
            int n = scanner.nextInt();
            for (int i = 1; i <= m && i <= n; i++) {
                if (m % i == 0 && n % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("最大公因數="+gcd);
        }
        scanner.close();
    }
}
