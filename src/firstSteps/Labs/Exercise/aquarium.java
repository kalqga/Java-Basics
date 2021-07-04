package firstSteps.Labs.Exercise;

import java.util.Scanner;

public class aquarium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double aq_volume = length * width *height;
        double total_liters = aq_volume * 0.001;
        double percentage = percent * 0.01;

        double total = total_liters * (1 - percentage);

        System.out.printf("%.2f", total);

    }
}
