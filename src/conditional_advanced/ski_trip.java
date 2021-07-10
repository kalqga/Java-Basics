package conditional_advanced;

import java.util.Scanner;

public class ski_trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int stay = Integer.parseInt(scan.nextLine()) - 1;
        String type_of_accommodation = scan.nextLine();
        String review = scan.nextLine();
        double total = 0.0;

        switch (type_of_accommodation) {
            case "room for one person":
                if (stay < 10) {
                    total = stay * 18.00;
                } else if (stay >= 10 && stay <= 15) {
                    total = stay * 18.00;
                } else if (stay > 15) {
                    total = stay * 18.00;
                }
                switch (review) {
                    case "positive":
                        total = total + (total * 0.25);
                        System.out.printf("%.2f", total);
                        break;
                    case "negative":
                        total = total - (total * 0.10);
                        System.out.printf("%.2f", total);
                        break;
                }
                break;
            case "apartment":
                if (stay < 10) {
                    total = stay * 25.00;
                    total -= total * 0.30;
                } else if (stay >= 10 && stay <= 15) {
                    total = stay * 25.00;
                    total -= total * 0.35;
                } else if (stay > 15) {
                    total = stay * 25.00;
                    total -= total * 0.50;
                }
                switch (review) {
                    case "positive":
                        total = total + (total * 0.25);
                        System.out.printf("%.2f", total);
                        break;
                    case "negative":
                        total = total - (total * 0.10);
                        System.out.printf("%.2f", total);
                        break;
                }
                break;
            case "president apartment":
                if (stay < 10) {
                    total = stay * 35.00;
                    total -= total * 0.10;
                } else if (stay >= 10 && stay <= 15) {
                    total = stay * 35.00;
                    total -= total * 0.15;
                } else if (stay > 15) {
                    total = stay * 35.00;
                    total -= total * 0.20;
                }
                switch (review) {
                    case "positive":
                        total = total + (total * 0.25);
                        System.out.printf("%.2f", total);
                        break;
                    case "negative":
                        total = total - (total * 0.10);
                        System.out.printf("%.2f", total);
                        break;
                }
                break;
        }


    }
}
