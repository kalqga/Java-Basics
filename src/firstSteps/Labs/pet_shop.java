package firstSteps.Labs;

import java.util.Scanner;

public class pet_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dogs_num = Integer.parseInt(scan.nextLine());
        int rest_of_animals = Integer.parseInt(scan.nextLine());

        double dogs_food = 2.50;
        double other_food = 4.00;
        double result = (dogs_food * dogs_num) + (other_food * rest_of_animals);

        System.out.printf("%.1f lv.", result);
    }
}
