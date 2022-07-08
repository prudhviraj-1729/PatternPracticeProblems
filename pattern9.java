import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(i);
            }
            else {
                sum = sum*11;
                System.out.print(sum);
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
1
11 
121
1331
14641
 */
