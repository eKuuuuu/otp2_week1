package week1;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter language (e.g., en, fi, sv, ja): ");
        String language = sc.nextLine();
        System.out.print("Enter country (e.g., US, FI, SE, JP): ");
        String country = sc.nextLine();

        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("InClass", locale);

        System.out.println(rb.getString("item_price"));
        double price = sc.nextDouble();
        System.out.println(rb.getString("item_quantity"));
        int quantity = sc.nextInt();

        double totalCost = calculateTotalCost(price, quantity);

        System.out.println(rb.getString("total_cost") + " " + totalCost);

        sc.close();
    }

    public static double calculateTotalCost(double price, int quantity) {
        return price * Math.abs(quantity);
    }
}