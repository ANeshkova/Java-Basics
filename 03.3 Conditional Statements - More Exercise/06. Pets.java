import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int foodKg = Integer.parseInt(scan.nextLine());
        double dogKg = Double.parseDouble(scan.nextLine());
        double catKg = Double.parseDouble(scan.nextLine());
        double tortoiseGr = Double.parseDouble(scan.nextLine());

        double needFoodKg = (dogKg + catKg + (tortoiseGr / 1000)) * days;

        if (foodKg >= needFoodKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - needFoodKg));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(needFoodKg - foodKg));
        }
    }
}
