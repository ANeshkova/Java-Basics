import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceVegetableKG = Double.parseDouble(scan.nextLine());
        double priceFruitKG = Double.parseDouble(scan.nextLine());
        int VegetableKG = Integer.parseInt(scan.nextLine());
        int FruitKG = Integer.parseInt(scan.nextLine());

        double price = (priceVegetableKG * VegetableKG) + (priceFruitKG * FruitKG);
        double Euro = price / 1.94;

        System.out.printf("%.2f", Euro);
    }
}
