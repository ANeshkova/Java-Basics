import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nights = Integer.parseInt(scan.nextLine()) - 1;
        String roomType = scan.nextLine();
        String rate = scan.nextLine();

        double priceForSingleNight = 0.00;

        if ("room for one person".equals(roomType)) {
            priceForSingleNight = 18.00;
        } else if ("apartment".equals(roomType)) {
            priceForSingleNight = 25.00;
        } else {
            priceForSingleNight = 35.00;
        }

        double cost = priceForSingleNight * nights;

        if ("apartment".equals(roomType)) {
            if (nights < 10) {
                cost = cost * 0.70;
            } else if (nights <= 15) {
                cost = cost * 0.65;
            } else {
                cost = cost * 0.50;
            }
        } else if ("president apartment".equals(roomType)) {
            if (nights < 10) {
                cost = cost * 0.90;
            } else if (nights <= 15) {
                cost = cost * 0.85;
            } else {
                cost = cost * 0.80;
            }
        }

        if ("positive".equals(rate)) {
            cost = cost * 1.25;
        } else {
            cost = cost * 0.90;
        }

        System.out.printf("%.2f", cost);
    }
}
