import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        int cm3 = length * width * height;
        double litre = cm3 * 0.001;
        double percentage = percent * 0.01;
        double litreWeNeed = litre * (1 - percentage);

        System.out.printf("%.3f", litreWeNeed);
    }
}
