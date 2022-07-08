import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j);
            }
            for (int k = n - i; k > 0; k--) {
                System.out.print(n);
            }
            System.out.println();
        }
        sc.close();
    }
}
