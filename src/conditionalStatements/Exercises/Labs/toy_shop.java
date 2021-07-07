package conditionalStatements.Exercises.Labs;

import java.util.Scanner;

public class toy_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double one_puzzle = 2.60;
        Double one_doll = 3.00;
        Double one_bear = 4.10;
        Double one_minion = 8.20;
        Double one_truck = 2.00;


        Double vacation_price = Double.parseDouble(scan.nextLine());
        Double puzzles_num = Double.parseDouble(scan.nextLine());
        Double dolls_num = Double.parseDouble(scan.nextLine());
        Double bears_num = Double.parseDouble(scan.nextLine());
        Double minions_num = Double.parseDouble(scan.nextLine());
        Double trucks_num = Double.parseDouble(scan.nextLine());

        Double total_num = puzzles_num + dolls_num + bears_num + minions_num + trucks_num;

        Double total_sum = (puzzles_num * one_puzzle) + (dolls_num * one_doll) + (bears_num * one_bear) + (minions_num * one_minion) + (trucks_num * one_truck);

        if (total_num >= 50) {
            total_sum -= total_sum * 0.25;
        }

        total_sum -= total_sum * 0.1;

        if (total_sum >= vacation_price) {
            System.out.printf("Yes! %.2f lv left.", total_sum - vacation_price);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(total_sum - vacation_price));
        }


    }
}
