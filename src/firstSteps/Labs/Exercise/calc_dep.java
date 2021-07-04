package firstSteps.Labs.Exercise;

import java.util.Scanner;

public class calc_dep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dep = Double.parseDouble(scan.nextLine());
        int period = Integer.parseInt(scan.nextLine());
        double glp = Double.parseDouble(scan.nextLine());



        double total = dep + period * ((dep * glp / 100) / 12);
        System.out.println(total);
    }
}
