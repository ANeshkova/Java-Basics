import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuel = scan.nextLine().toLowerCase();
        double fuelLiter = Double.parseDouble(scan.nextLine());

        if (fuel.equals("diesel") || fuel.equals("gasoline") || fuel.equals("gas")) {
            if (fuelLiter >= 25) {
                System.out.println("You have enough " + fuel + ".");
            } else {
                System.out.printf("Fill your tank with %s!", fuel);
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
