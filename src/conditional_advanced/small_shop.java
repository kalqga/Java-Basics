package conditional_advanced;

import java.util.Scanner;

public class small_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double result = 0;

        switch (product) {
            case "coffee":
                if (city.equals("Sofia")) {
                    result = quantity * 0.50;
                } else if (city.equals("Plovdiv")) {
                    result = quantity * 0.40;
                } else if (city.equals("Varna")) {
                    result = quantity * 0.45;
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    result = quantity * 0.80;
                } else if (city.equals("Plovdiv")) {
                    result = quantity * 0.70;
                } else if (city.equals("Varna")) {
                    result = quantity * 0.70;
                }
                break;
            case "beer":
                if (city.equals("Sofia")) {
                    result = quantity * 1.20;
                } else if (city.equals("Plovdiv")) {
                    result = quantity * 1.15;
                } else if (city.equals("Varna")) {
                    result = quantity * 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    result = quantity * 1.45;
                } else if (city.equals("Plovdiv")) {
                    result = quantity * 1.30;
                } else if (city.equals("Varna")) {
                    result = quantity * 1.35;
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")) {
                    result = quantity * 1.60;
                } else if (city.equals("Plovdiv")) {
                    result = quantity * 1.50;
                } else if (city.equals("Varna")) {
                    result = quantity * 1.55;
                }
                break;
        }
        System.out.println(result);
    }
}
