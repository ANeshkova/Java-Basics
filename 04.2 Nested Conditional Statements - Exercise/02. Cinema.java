import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        double rows = Double.parseDouble(scan.nextLine());
        double columns = Double.parseDouble(scan.nextLine());
        double income = 0.00;

        if (projection.equals("Premiere")) {
            income = rows * columns * 12;

        } else if (projection.equals("Normal")) {
            income = rows * columns * 7.5;

        } else if (projection.equals("Discount")) {
            income = rows * columns * 5;

        }

        System.out.printf("%.2f leva", income);
    }
}