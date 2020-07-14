import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuel = scan.nextLine();
        double fuelLiter = Double.parseDouble(scan.nextLine());
        String clubCard = scan.nextLine();

        double priceGasoline = fuelLiter * 2.22;
        double priceDiesel = fuelLiter * 2.33;
        double priceGas = fuelLiter * 0.93;

        if (clubCard.equals("Yes")) {
            if (fuel.equals("Gasoline")) {
                priceGasoline = priceGasoline - (fuelLiter * 0.18);
            } else if (fuel.equals("Diesel")) {
                priceDiesel = priceDiesel - (fuelLiter * 0.12);
            } else {
                priceGas = priceGas - (fuelLiter * 0.08);
            }
            if (fuelLiter >= 20 && fuelLiter <= 25) {
                if (fuel.equals("Gasoline")) {
                    priceGasoline = priceGasoline * 0.92;
                    System.out.printf("%.2f lv.", priceGasoline);
                } else if (fuel.equals("Diesel")) {
                    priceDiesel = priceDiesel * 0.92;
                    System.out.printf("%.2f lv.", priceDiesel);
                } else {
                    priceGas = priceGas * 0.92;
                    System.out.printf("%.2f lv.", priceGas);
                }
            } else if (fuelLiter > 25) {
                if (fuel.equals("Gasoline")) {
                    priceGasoline = priceGasoline * 0.90;
                    System.out.printf("%.2f lv.", priceGasoline);
                } else if (fuel.equals("Diesel")) {
                    priceDiesel = priceDiesel * 0.90;
                    System.out.printf("%.2f lv.", priceDiesel);
                } else {
                    priceGas = priceGas * 0.90;
                    System.out.printf("%.2f lv.", priceGas);
                }
            } else {
                if (fuel.equals("Gasoline")) {
                    System.out.printf("%.2f lv.", priceGasoline);
                } else if (fuel.equals("Diesel")) {
                    System.out.printf("%.2f lv.", priceDiesel);
                } else {
                    System.out.printf("%.2f lv.", priceGas);
                }
            }
        } if (clubCard.equals("No")) {
            if (fuelLiter >= 20 && fuelLiter <= 25) {
                if (fuel.equals("Gasoline")) {
                    priceGasoline = priceGasoline * 0.92;
                    System.out.printf("%.2f lv.", priceGasoline);
                } else if (fuel.equals("Diesel")) {
                    priceDiesel = priceDiesel * 0.92;
                    System.out.printf("%.2f lv.", priceDiesel);
                } else {
                    priceGas = priceGas * 0.92;
                    System.out.printf("%.2f lv.", priceGas);
                }
            } else if (fuelLiter > 25) {
                if (fuel.equals("Gasoline")) {
                    priceGasoline = priceGasoline * 0.90;
                    System.out.printf("%.2f lv.", priceGasoline);
                } else if (fuel.equals("Diesel")) {
                    priceDiesel = priceDiesel * 0.90;
                    System.out.printf("%.2f lv.", priceDiesel);
                } else {
                    priceGas = priceGas * 0.90;
                    System.out.printf("%.2f lv.", priceGas);
                }
            } else {
                if (fuel.equals("Gasoline")) {
                    System.out.printf("%.2f lv.", priceGasoline);
                } else if (fuel.equals("Diesel")) {
                    System.out.printf("%.2f lv.", priceDiesel);
                } else {
                    System.out.printf("%.2f lv.", priceGas);
                }
            }
        }
    }
}

