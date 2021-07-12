package for_loop;

import java.util.Scanner;

public class even_powers_of_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i += 2) {
            double a = Math.pow(2, i);
            System.out.printf("%.0f\n", a);
        }

    }
}
