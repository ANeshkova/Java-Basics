import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double priceClothesFor1 = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.10;
        double priceClothesForAll = people * priceClothesFor1;

        if (people > 150) {
            priceClothesForAll *= 0.90;
        }
        
	double expence = decor + priceClothesForAll;
        
	if (expence > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", expence - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - expence);
        }
    }
}
