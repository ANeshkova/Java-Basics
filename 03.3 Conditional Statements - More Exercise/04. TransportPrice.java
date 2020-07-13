import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km = Integer.parseInt(scan.nextLine());
        String dayNight = scan.nextLine();
        double price = 0.00;

        if (km < 20) {
            if (dayNight.equals("day")) {
                price = 0.79 * km + 0.70;
                System.out.printf("%.2f", price);
            } else if (dayNight.equals("night")) {
                price = 0.90 * km + 0.70;
                System.out.printf("%.2f", price);
            }
        } if (km >= 20 && km < 100) {
            price = 0.09 * km;
            System.out.printf("%.2f", price);
        } if (km >= 100) {
            price = 0.06 * km;
            System.out.printf("%.2f", price);
        }
    }
}
