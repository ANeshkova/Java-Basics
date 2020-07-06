import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side1 = Double.parseDouble(scan.nextLine());
        double side2 = Double.parseDouble(scan.nextLine());
        double high = Double.parseDouble(scan.nextLine());

        double area = (side1 + side2) * high / 2;

        System.out.printf("%.2f", area);
    }
}
