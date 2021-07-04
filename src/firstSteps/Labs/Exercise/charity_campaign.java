package firstSteps.Labs.Exercise;

import java.util.Scanner;

public class charity_campaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int cooks = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int gofr = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double per_cook = (cakes * 45) + (gofr * 5.80) + (pancakes * 3.20);
        double rough_total = per_cook * cooks * days;
        double total = rough_total - (rough_total / 8);
        System.out.printf("%.2f", total);
    }
}
