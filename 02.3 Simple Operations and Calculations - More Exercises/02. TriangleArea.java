import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side = Double.parseDouble(scan.nextLine());
        double high = Double.parseDouble(scan.nextLine());

        double area = side * high / 2;

        System.out.printf("%.2f", area);
    }
}
