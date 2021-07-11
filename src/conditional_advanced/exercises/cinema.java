package conditional_advanced.exercises;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        double price = 0.0;

        switch (type) {
            case "Premiere":
                price = 12 * (rows * columns);
                break;
            case "Normal":
                price = 7.50 * (rows * columns);
                break;
            case "Discount":
                price = 5 * (rows * columns);
                break;
        }
        System.out.printf("%.2f leva", price);


    }
}
