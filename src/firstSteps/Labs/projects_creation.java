package firstSteps.Labs;

import java.util.Scanner;

public class projects_creation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projectsNum = Integer.parseInt(scan.nextLine());

        int result = projectsNum * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, result, projectsNum);
    }
}
