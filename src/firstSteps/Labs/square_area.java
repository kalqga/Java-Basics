package firstSteps.Labs;

import java.util.Scanner;

public class square_area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());

        int area = a * a;
        System.out.println(area);
    }
}
