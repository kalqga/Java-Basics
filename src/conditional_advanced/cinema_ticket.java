package conditional_advanced;

import java.util.Scanner;

public class cinema_ticket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("16");
                break;
        }

    }
}
