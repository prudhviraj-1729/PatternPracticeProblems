import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(i);
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
