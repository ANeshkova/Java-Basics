import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double highHouse = Double.parseDouble(scan.nextLine());
        double lengthHouse = Double.parseDouble(scan.nextLine());
        double hRoof = Double.parseDouble(scan.nextLine());

        double door = 1.2 * 2;
        double smallSide = 2 * (highHouse * highHouse) - door;
        double windows = 2 * (1.5 * 1.5);
        double longSide = 2 * (lengthHouse * highHouse) - windows;

        double smallRoof = 2 * ((hRoof * highHouse) / 2);
        double longRoof = 2 * (lengthHouse * highHouse);

        double green = (smallSide + longSide) / 3.4;
        double red = (smallRoof + longRoof) / 4.3;

        System.out.printf("%.2f%n", green);
        System.out.printf("%.2f", red);
    }
}
