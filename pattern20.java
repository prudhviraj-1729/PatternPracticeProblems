import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(i);
                } else {
                    k = k + n - j + 1;
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}


/*for (int i = 1; i <= n; i++) {
    int k = 0;
    for (int j = 1; j <= i; j++) {
        if (j == 1) {
            System.out.print(i);
        } else {
            k = k + i + (n-i) -j;
            System.out.print(k + i+1);
            k++;
        }
    }
    System.out.println();
}*/
