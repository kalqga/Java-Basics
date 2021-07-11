package conditional_advanced.exercises;

import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String destination = "";
        String accommodation = "";

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    accommodation = "Camp";
                    budget = budget * 0.3;
                } else if (budget > 100 && budget <= 1000) {
                    destination = "Balkans";
                    accommodation = "Camp";
                    budget = budget * 0.4;
                } else if (budget > 1000) {
                    destination = "Europe";
                    accommodation = "Hotel";
                    budget = budget * 0.9;
                }
                break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    accommodation = "Hotel";
                    budget = budget * 0.7;
                } else if (budget > 100 && budget <= 1000) {
                    destination = "Balkans";
                    accommodation = "Hotel";
                    budget = budget * 0.8;
                } else if (budget > 1000) {
                    destination = "Europe";
                    accommodation = "Hotel";
                    budget = budget * 0.9;
                }
                break;
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", accommodation, budget);


    }
}
