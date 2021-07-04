package firstSteps.Labs.Exercise;

import java.util.Scanner;

public class bd_party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hall_rent = Integer.parseInt(scan.nextLine());

        double cake = hall_rent * 0.2;
        double drinks = cake - (cake * 0.45);
        int animator = hall_rent / 3;
        double total = hall_rent + cake + drinks + animator;
        System.out.println(total);

    }
}
