package conditional_advanced;

import java.util.Scanner;

public class fruit_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double banana_price = 0.0;
        double apple_price = 0.0;
        double orange_price = 0.0;
        double grapefruit_price = 0.0;
        double kiwi_price = 0.0;
        double pineapple_price = 0.0;
        double grape_price = 0.0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                banana_price = 2.50;
                apple_price = 1.20;
                orange_price = 0.85;
                grapefruit_price = 1.45;
                kiwi_price = 2.70;
                pineapple_price = 5.50;
                grape_price = 3.85;
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", quantity * banana_price);
                        break;
                    case "apple":
                        System.out.printf("%.2f", quantity * apple_price);
                        break;
                    case "orange":
                        System.out.printf("%.2f", quantity * orange_price);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", quantity * grapefruit_price);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", quantity * kiwi_price);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", quantity * pineapple_price);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", quantity * grape_price);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                banana_price = 2.70;
                apple_price = 1.25;
                orange_price = 0.90;
                grapefruit_price = 1.60;
                kiwi_price = 3.00;
                pineapple_price = 5.60;
                grape_price = 4.20;
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", quantity * banana_price);
                        break;
                    case "apple":
                        System.out.printf("%.2f", quantity * apple_price);
                        break;
                    case "orange":
                        System.out.printf("%.2f", quantity * orange_price);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", quantity * grapefruit_price);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", quantity * kiwi_price);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", quantity * pineapple_price);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", quantity * grape_price);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;


        }


    }
}
