import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;

        if (product.equals("coffee"))
        {
            if (city.equals("Varna")){
                price = quantity * 0.45;
            }
            else if (city.equals("Plovdiv"))
            {
                price = quantity * 0.40;
            }
            else if (city.equals("Sofia"))
            {
                price = quantity * 0.50;
            }
        }
        else if (product.equals("water"))
        {
            if (city.equals("Varna")){
                price = quantity * 0.70;
            }
            else if (city.equals("Plovdiv"))
            {
                price = quantity * 0.70;
            }
            else if (city.equals("Sofia"))
            {
                price = quantity * 0.80;
            }
        }
        else if (product.equals("beer"))
        {
            if (city.equals("Varna")){
                price = quantity * 1.10;
            }
            else if (city.equals("Plovdiv"))
            {
                price = quantity * 1.15;
            }
            else if (city.equals("Sofia"))
            {
                price = quantity * 1.20;
            }
        }
        else if (product.equals("sweets"))
        {
            if (city.equals("Varna")){
                price = quantity * 1.35;
            }
            else if (city.equals("Plovdiv"))
            {
                price = quantity * 1.30;
            }
            else if (city.equals("Sofia"))
            {
                price = quantity * 1.45;
            }
        }
        else if (product.equals("peanuts"))
        {
            if (city.equals("Varna")){
                price = quantity * 1.55;
            }
            else if (city.equals("Plovdiv"))
            {
                price = quantity * 1.50;
            }
            else if (city.equals("Sofia"))
            {
                price = quantity * 1.60;
            }
        }
        System.out.println(price);


    }
}
