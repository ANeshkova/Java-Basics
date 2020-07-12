import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());
        double pricePer1 = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.1;
        double priceAllStatistes = number * pricePer1;

        if (number > 150) {
            priceAllStatistes *= 0.9;
        }

        double expense = priceAllStatistes + decor;

        if (budget < expense) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", expense - budget);
        } else if (budget >= expense) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - expense);
        }
    }
}
