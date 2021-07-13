package for_loop.exercises;

import java.util.Scanner;

public class half_sum_element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        int biggest = Integer.MIN_VALUE;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            if (a >= biggest) {
                biggest = a;
            }
            result += a;

        }
        if (result - biggest == biggest) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", biggest);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(biggest - (result - biggest)));
        }


    }
}
