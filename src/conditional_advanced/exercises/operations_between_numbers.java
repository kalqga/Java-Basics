package conditional_advanced.exercises;

import java.util.Scanner;

public class operations_between_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N1 = Integer.parseInt(scan.nextLine());
        int N2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        double result = 0.0;

        switch (operator) {
            case "+":
                result = N1 + N2;
                if (result % 2 == 0){
                    System.out.printf("%d + %d = %.0f - even", N1, N2, result);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", N1, N2, result);
                }
                break;
            case "-":
                result = N1 - N2;
                if (result % 2 == 0){
                    System.out.printf("%d - %d = %.0f - even", N1, N2, result);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", N1, N2, result);
                }
                break;
            case "*":
                result = N1 * N2;
                if (result % 2 == 0){
                    System.out.printf("%d * %d = %.0f - even", N1, N2, result);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", N1, N2, result);
                }
                break;
            case "/":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    result = (double) N1 / (double) N2;
                    System.out.printf("%d / %d = %.2f", N1, N2, result);
                }
                break;
            case "%":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    result = (double) N1 % (double) N2;
                    System.out.printf("%d %% %d = %.0f", N1, N2, result);
                }
                break;
        }

    }
}
