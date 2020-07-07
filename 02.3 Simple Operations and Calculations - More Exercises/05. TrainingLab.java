import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        double lengthCm = length * 100;
        double widthCm = width * 100;

        double widthWithoutCorridor = widthCm - 100;
        double widthPlaces = Math.floor(widthWithoutCorridor / 70);
        double lengthPlaces = Math.floor(lengthCm / 120);

        double allPlaces = widthPlaces * lengthPlaces - 3;

        System.out.printf("%.0f", allPlaces);
    }
}
