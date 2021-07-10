package conditional_advanced;

import java.util.Scanner;

public class trade_commissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());

        switch (city) {
            case "Sofia":
                if (sales < 0) {
                    System.out.println("error");
                } else if (sales <= 500 || sales == 0) {
                    System.out.printf("%.2f", sales * 0.05);
                } else if (sales > 500 && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.07);
                } else if (sales > 1000 && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.08);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", sales * 0.12);
                }
                break;
            case "Varna":
                if (sales < 0) {
                    System.out.println("error");
                } else if (sales <= 500 || sales == 0) {
                    System.out.printf("%.2f", sales * 0.045);
                } else if (sales > 500 && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.075);
                } else if (sales > 1000 && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.1);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", sales * 0.13);
                }
                break;
            case "Plovdiv":
                if (sales < 0) {
                    System.out.println("error");
                } else if (sales <= 500 || sales == 0) {
                    System.out.printf("%.2f", sales * 0.055);
                } else if (sales > 500 && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.08);
                } else if (sales > 1000 && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.12);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", sales * 0.145);
                }
                break;
            default:
                System.out.println("error");
                break;
        }



    }
}
