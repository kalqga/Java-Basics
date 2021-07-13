package for_loop.exercises;

import java.util.Scanner;

public class divide_without_remainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scan.nextLine());

            if (a % 2 == 0) {
                p1 += 1;
            }
            if (a % 3 == 0) {
                p2 += 1;
            }
            if (a % 4 == 0) {
                p3 += 1;
            }

        }

        double p1_percent = (p1 / n) * 100;
        double p2_percent = (p2 / n) * 100;
        double p3_percent = (p3 / n) * 100;

        System.out.printf("%.2f%%\n", p1_percent);
        System.out.printf("%.2f%%\n", p2_percent);
        System.out.printf("%.2f%%", p3_percent);


    }
}
