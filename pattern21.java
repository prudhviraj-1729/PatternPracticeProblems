import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int k = i;
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(i);
                } else {
                    k = k + i;
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        for (int i = 1; i < n - 1; i++) {
            int k = n + i - 1;
            int z = k;
            for (int j = 1; j < n - i; j++) {
                if (j == 1) {
                    System.out.print(k);
                }
                else {
                    z = z + k;
                    System.out.print(z);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
