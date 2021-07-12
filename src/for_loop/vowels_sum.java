package for_loop;

import java.util.Scanner;

public class vowels_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int result = 0;

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            switch (a) {
                case 'a':
                    result += 1;
                    break;
                case 'e':
                    result += 2;
                    break;
                case 'i':
                    result += 3;
                    break;
                case 'o':
                    result += 4;
                    break;
                case 'u':
                    result += 5;
                    break;

            }

        }
        System.out.println(result);

    }
}
