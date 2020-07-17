import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double fisherman = Double.parseDouble(scan.nextLine());

        double price = 0.00;
        double moneyNeed;
        double moneyLeft;

        switch (season) {
            case "Spring":
                if (fisherman <= 6) {
                    price = 3000 * 0.90;
                } else if (fisherman >= 7 && fisherman <= 11) {
                    price = 3000 * 0.85;
                } else if (fisherman >= 12) {
                    price = 3000 * 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                if (fisherman <= 6) {
                    price = 4200 * 0.90;
                } else if (fisherman >= 7 && fisherman <= 11) {
                    price = 4200 * 0.85;
                } else if (fisherman >= 12) {
                    price = 4200 * 0.75;
                }
                break;
            case "Winter":
                if (fisherman <= 6) {
                    price = 2600 * 0.90;
                } else if (fisherman >= 7 && fisherman <= 11) {
                    price = 2600 * 0.85;
                } else if (fisherman >= 12) {
                    price = 2600 * 0.75;
                }
                break;
        }

        if (!"Autumn".equals(season) && fisherman % 2 == 0) {
            price *= 0.95;

        }

        if (budget >= price) {
            moneyNeed = budget - price;

            System.out.printf("Yes! You have %.2f leva left.", moneyNeed);
        } else {
            moneyLeft = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
        }
    }
}
