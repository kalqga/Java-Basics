package conditionalStatements.Exercises.Labs;

import java.util.Scanner;

public class greater_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
