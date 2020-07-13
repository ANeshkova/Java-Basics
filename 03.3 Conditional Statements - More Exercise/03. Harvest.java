import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = Integer.parseInt(scan.nextLine());    // X кв.м е лозето
        double Y = Double.parseDouble(scan.nextLine());    // Y грозде за един кв.м
        int Z = Integer.parseInt(scan.nextLine());   // Z нужни литри вино
        int numberWorkers = Integer.parseInt(scan.nextLine());   //  брой работници

        double grapes = X * Y;
        double percent = grapes * 0.4;
        double wineLiter = percent / 2.5;

        if (Z > wineLiter) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(Z - wineLiter));
        } else if (Z <= wineLiter){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineLiter));
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(wineLiter - Z), Math.ceil((wineLiter - Z) / numberWorkers));
        }
    }
}
