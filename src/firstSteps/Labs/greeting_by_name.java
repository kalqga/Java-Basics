package firstSteps.Labs;

import java.util.Scanner;

public class greeting_by_name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
