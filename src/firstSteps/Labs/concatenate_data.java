package firstSteps.Labs;

import java.util.Scanner;

public class concatenate_data {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String city = scan.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", name, lastName,age,city);
    }
}
