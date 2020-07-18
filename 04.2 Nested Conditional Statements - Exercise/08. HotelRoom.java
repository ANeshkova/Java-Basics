import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int overnight = Integer.parseInt(scan.nextLine());

        double priceStudio = 0.00;
        double priceApart = 0.00;

        switch (month) {
            case "May":
            case "October":
                priceApart = 65 * overnight;
                priceStudio = 50 * overnight;

                if (overnight > 14) {
                    priceStudio *= 0.70;
                } else if (overnight > 7) {
                    priceStudio *= 0.95;
                }
                break;
            case "June":
            case "September":
                priceApart = 68.70 * overnight;
                priceStudio = 75.20 * overnight;
                if (overnight > 14) {
                    priceStudio *= 0.80;
                }
                break;
            case "July":
            case "August":
                priceApart = 77 * overnight;
                priceStudio = 76 * overnight;
                break;
        }

        if (overnight > 14) {
            priceApart *= 0.90;
        }

        System.out.printf("Apartment: %.2f lv.%n", priceApart);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
