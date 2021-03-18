package firstSteps.Labs;

import java.util.Scanner;

public class yard_greening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double meters_to_be_greened = Double.parseDouble(scan.nextLine());
        double dds = 7.61;
        double discount = 0.18;

        double total_for_yard = meters_to_be_greened * dds;
        double total_discount = total_for_yard * discount;
        double result = total_for_yard - total_discount;

        System.out.printf("The final price is: %.2f lv.\n", result);
        System.out.printf("The discount is: %.2f lv.", total_discount);
    }
}
