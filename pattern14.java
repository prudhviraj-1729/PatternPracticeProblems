import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ; i <= n ; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k < i + 1; k++) {
                System.out.print(k);
            }
            for (int l = i-1; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        sc.close();
    }
}
