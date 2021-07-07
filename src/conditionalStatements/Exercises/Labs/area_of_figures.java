package conditionalStatements.Exercises.Labs;

import java.util.Scanner;

public class area_of_figures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String object = scan.nextLine();

        if (object.equals("square")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double result = a * a;
            System.out.printf("%.3f", result);

        } else if (object.equals("rectangle")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double b = Double.parseDouble(scan.nextLine());
            Double result = a * b;

            System.out.printf("%.3f", result);

        } else if (object.equals("circle")) {
            Double r = Double.parseDouble(scan.nextLine());
            Double result = (r * r) * Math.PI;

            System.out.printf("%.3f", result);

        } else if (object.equals("triangle")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double h = Double.parseDouble(scan.nextLine());
            Double result = (a * h) / 2;

            System.out.printf("%.3f", result);
        }
    }
}
