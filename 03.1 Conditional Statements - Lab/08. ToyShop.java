import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scan.nextLine());
        int puzzle = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double priceToys = (puzzle * 2.60) + (dolls * 3) + (bears * 4.10)
                + (minions * 8.20) + (trucks * 2);
        int Toys = puzzle + dolls + bears + minions + trucks;

        if (Toys >= 50) {
            priceToys = priceToys * 0.75;
        }

        priceToys = priceToys * 0.90;

        if (priceToys >= priceExcursion) {
            System.out.printf("Yes! %.2f lv left.", priceToys - priceExcursion);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceExcursion - priceToys);
        }
    }
}
