package for_loop.exercises;

import java.util.Scanner;

public class odd_even_position {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double odd_sum = 0.0;
        double odd_min = 100000000000.0;
        double odd_max = -100000000000.0;
        double even_sum = 0.0;
        double even_min = 100000000000.0;
        double even_max = -100000000000.0;

        int even_count = 0;
        int odd_count = 0;

        for (int i = 1; i <= n; i++) {
            double a = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                even_count += 1;
                even_sum += a;
                if (a >= even_max) {
                    even_max = a;
                }
                if (a <= even_min) {
                    even_min = a;
                }
            } else {
                odd_count += 1;
                odd_sum += a;
                if (a >= odd_max) {
                    odd_max = a;
                }
                if (a <= odd_min) {
                    odd_min = a;
                }
            }
        }

        if (even_count > 0 && odd_count > 0){
            System.out.printf("OddSum=%.2f,\n", odd_sum);
            System.out.printf("OddMin=%.2f,\n", odd_min);
            System.out.printf("OddMax=%.2f,\n", odd_max);
            System.out.printf("EvenSum=%.2f,\n", even_sum);
            System.out.printf("EvenMin=%.2f,\n", even_min);
            System.out.printf("EvenMax=%.2f", even_max);
        } else if (even_count > 0 && odd_count == 0) {
            System.out.printf("OddSum=%.2f,\n", odd_sum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,\n", even_sum);
            System.out.printf("EvenMin=%.2f,\n", even_min);
            System.out.printf("EvenMax=%.2f", even_max);
        } else if (even_count == 0 && odd_count > 0) {
            System.out.printf("OddSum=%.2f,\n", odd_sum);
            System.out.printf("OddMin=%.2f,\n", odd_min);
            System.out.printf("OddMax=%.2f,\n", odd_max);
            System.out.printf("EvenSum=%.2f,\n", even_sum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("OddSum=%.2f,\n", odd_sum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,\n", even_sum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }




    }
}
