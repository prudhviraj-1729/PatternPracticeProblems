import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(i+" ");
                }
                else if (j % 2 == 0) {
                    //k = k + n + j - 2 * (i -2 );
                    //k = k + n + 2 - 2 * (i-2);
                    k = k + 2 * (n-i) + 1;
                    System.out.print(k+" ");
                }
                else {
                    k = k + 2 * (i-j+1);
                    System.out.print(k +" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
