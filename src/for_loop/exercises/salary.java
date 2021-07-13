package for_loop.exercises;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int facebook = 150;
        int instagram = 100;
        int reddit = 50;

        int tabs_opened = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= tabs_opened; i++) {
            String tab_name = scan.nextLine();

            switch (tab_name) {
                case "Facebook":
                    salary -= facebook;
                    break;
                case "Instagram":
                    salary -= instagram;
                    break;
                case "Reddit":
                    salary -= reddit;
                    break;
                default:
                    break;
            }
            if (salary <= 0) {
                break;
            }

        }

        if (salary > 0){
            System.out.println(salary);
        } else {
            System.out.println("You have lost your salary.");
        }

    }
}
