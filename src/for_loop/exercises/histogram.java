package for_loop.exercises;

import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.nextLine());

            if (1 <= a && a < 200) {
                p1 += 1;
            } else if (200 <= a && a <= 399) {
                p2 += 1;
            } else if (399 < a && a <= 599) {
                p3 += 1;
            } else if (599 < a && a <= 799) {
                p4 += 1;
            } else if (a >= 800) {
                p5 += 1;
            }

        }

        double p1_percent = (p1 / n) * 100;
        double p2_percent = (p2 / n) * 100;
        double p3_percent = (p3 / n) * 100;
        double p4_percent = (p4 / n) * 100;
        double p5_percent = (p5 / n) * 100;

        System.out.printf("%.2f%%\n", p1_percent);
        System.out.printf("%.2f%%\n", p2_percent);
        System.out.printf("%.2f%%\n", p3_percent);
        System.out.printf("%.2f%%\n", p4_percent);
        System.out.printf("%.2f%%", p5_percent);

    }
}
