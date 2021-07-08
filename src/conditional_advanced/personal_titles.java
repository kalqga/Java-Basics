package conditional_advanced;

import java.util.Scanner;

public class personal_titles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double age = Double.parseDouble(scan.nextLine());
        String sex = scan.nextLine();

        switch (sex) {
            case "m":
                if (age < 16) {
                    System.out.println("Master");
                } else {
                    System.out.println("Mr.");
                }
                break;
            case "f":
                if (age < 16) {
                    System.out.println("Miss");
                } else {
                    System.out.println("Ms.");
                }
                break;
        }

    }
}
