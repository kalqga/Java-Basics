package for_loop;

import java.util.Scanner;

public class sum_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            result += num;
        }
        System.out.println(result);

    }
}
