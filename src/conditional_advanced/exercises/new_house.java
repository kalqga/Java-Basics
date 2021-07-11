package conditional_advanced.exercises;

import java.util.Scanner;

public class new_house {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int f_num = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double total = 0.0;

        switch (flower) {
            case "Roses":
                total = f_num * 5;
                if (f_num > 80) {
                    total -= total * 0.1;
                }
                break;
            case "Dahlias":
                total = f_num * 3.80;
                if (f_num > 90) {
                    total -= total * 0.15;
                }
                break;
            case "Tulips":
                total = f_num * 2.80;
                if (f_num > 80) {
                    total -= total * 0.15;
                }
                break;
            case "Narcissus":
                total = f_num * 3;
                if (f_num < 120) {
                    total += total * 0.15;
                }
                break;
            case "Gladiolus":
                total = f_num * 2.50;
                if (f_num < 80) {
                    total += total * 0.2;
                }
                break;
        }
        if (budget >= total) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", f_num, flower, budget - total);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
        }

    }
}
