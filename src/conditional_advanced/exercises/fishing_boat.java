package conditional_advanced.exercises;

import java.util.Scanner;

public class fishing_boat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermen = Integer.parseInt(scan.nextLine());

        double ship_rent = 0.0;

        switch (season) {
            case "Spring":
                ship_rent = 3000;
                if (fishermen <= 6){
                    ship_rent -= ship_rent * 0.1;
                } else if (fishermen >= 7 && fishermen <= 11) {
                    ship_rent -= ship_rent * 0.15;
                } else if (fishermen >= 12) {
                    ship_rent -= ship_rent * 0.25;
                }
                if (fishermen % 2 == 0) {
                    ship_rent -= ship_rent * 0.05;
                }
                break;
            case "Summer":
                ship_rent = 4200;
                if (fishermen <= 6){
                    ship_rent -= ship_rent * 0.1;
                } else if (fishermen >= 7 && fishermen <= 11) {
                    ship_rent -= ship_rent * 0.15;
                } else if (fishermen >= 12) {
                    ship_rent -= ship_rent * 0.25;
                }
                if (fishermen % 2 == 0) {
                    ship_rent -= ship_rent * 0.05;
                }
                break;
            case "Autumn":
                ship_rent = 4200;
                if (fishermen <= 6){
                    ship_rent -= ship_rent * 0.1;
                } else if (fishermen >= 7 && fishermen <= 11) {
                    ship_rent -= ship_rent * 0.15;
                } else if (fishermen >= 12) {
                    ship_rent -= ship_rent * 0.25;
                }
                break;
            case "Winter":
                ship_rent = 2600;
                if (fishermen <= 6){
                    ship_rent -= ship_rent * 0.1;
                } else if (fishermen >= 7 && fishermen <= 11) {
                    ship_rent -= ship_rent * 0.15;
                } else if (fishermen >= 12) {
                    ship_rent -= ship_rent * 0.25;
                }
                if (fishermen % 2 == 0) {
                    ship_rent -= ship_rent * 0.05;
                }
                break;
        }
        if (budget >= ship_rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - ship_rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ship_rent - budget);
        }

    }
}
