import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        boolean workDay =
                "Monday".equals(day)
                || "Tuesday"  .equals(day)
                || "Wednesday".equals(day)
                || "Thursday".equals(day)
                || "Friday".equals(day);

        boolean weekend =
                "Saturday".equals(day) || "Sunday".equals(day);

        double price = 0.00;

        if (workDay) {
            if ("banana".equals(product)) {
                price = 2.50;
            } else if ("apple".equals(product)) {
                price = 1.20;
            } else if ("orange".equals(product)) {
                price = 0.85;
            } else if ("grapefruit".equals(product)) {
                price = 1.45;
            } else if ("kiwi".equals(product)) {
                price = 2.70;
            } else if ("pineapple".equals(product)) {
                price = 5.50;
            } else if ("grapes".equals(product)) {
                price = 3.85;
            }

        } else if (weekend) {
            if ("banana".equals(product)) {
                price = 2.70;
            } else if ("apple".equals(product)) {
                price = 1.25;
            } else if ("orange".equals(product)) {
                price = 0.90;
            } else if ("grapefruit".equals(product)) {
                price = 1.60;
            } else if ("kiwi".equals(product)) {
                price = 3.00;
            } else if ("pineapple".equals(product)) {
                price = 5.60;
            } else if ("grapes".equals(product)) {
                price = 4.20;
            }
        }

        if (price != 0.00) {
            System.out.printf("%.2f", quantity * price);
        } else {
            System.out.println("error");
        }
    }
}
