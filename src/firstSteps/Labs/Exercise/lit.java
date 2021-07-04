package firstSteps.Labs.Exercise;

import java.util.Scanner;

public class lit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pages_num = Integer.parseInt(scan.nextLine());
        int pages_per_hour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int total = (pages_num / pages_per_hour) / days;
        System.out.println(total);
    }
}
