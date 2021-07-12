package for_loop;

import java.util.Scanner;

public class odd_even_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                even += a;
            } else {
                odd += a;
            }
        }

        if (even == odd) {
            System.out.println("Yes");
            System.out.println("Sum = " + even);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(even - odd));
        }

    }
}
