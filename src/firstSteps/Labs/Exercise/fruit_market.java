package firstSteps.Labs.Exercise;

import java.util.Scanner;

public class fruit_market {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawberries_price = Double.parseDouble(scan.nextLine());
        double banana_quantity = Double.parseDouble(scan.nextLine());
        double orange_quantity = Double.parseDouble(scan.nextLine());
        double raspberry_quantity = Double.parseDouble(scan.nextLine());
        double strawberry_quantity = Double.parseDouble(scan.nextLine());

        double strawberry = strawberry_quantity * strawberries_price;
        double raspberry_price = strawberries_price * 0.5;
        double raspberry = raspberry_quantity * raspberry_price;
        double orange = orange_quantity * (raspberry_price - raspberry_price * 0.4);
        double banana = banana_quantity * (raspberry_price - raspberry_price * 0.8);

        double total = strawberry + raspberry + orange + banana;
        System.out.printf("%.2f", total);
    }
}
