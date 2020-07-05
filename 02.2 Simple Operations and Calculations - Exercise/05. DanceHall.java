import java.util.Scanner;

public class DanceHall {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double A = Double.parseDouble(scan.nextLine());

        double hall = (length * 100) * (width * 100);
        double wardrobe = (A * 100) * (A * 100);
        double bench = hall / 10;
        double space = hall - wardrobe - bench;
        double dancers = space / (40 + 7000);
        double down = Math.floor(dancers);

        System.out.printf("%.0f", down);
    }
}
