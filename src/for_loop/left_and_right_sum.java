package for_loop;

import java.util.Scanner;

public class left_and_right_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int res1 = 0;
        int res2 = 0;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            res1 += a;
        }
        for (int x = 1; x <= n; x++) {
            int b = Integer.parseInt(scan.nextLine());
            res2 += b;
        }
        if (res1 == res2) {
            System.out.printf("Yes, sum = %d", res1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(res1 - res2));
        }

    }
}
