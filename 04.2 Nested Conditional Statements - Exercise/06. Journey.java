import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination;
        String HolidayType;

        if (budget <= 100) {
            if (season.equals("summer")) {
                budget = budget * 0.30;
                HolidayType = "Camp";
                destination = "Bulgaria";
            } else {
                budget = budget * 0.70;
                HolidayType = "Hotel";
                destination = "Bulgaria";
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                budget = budget * 0.40;
                HolidayType = "Camp";
                destination = "Balkans";
            } else {
                budget = budget * 0.80;
                HolidayType = "Hotel";
                destination = "Balkans";
            }
        } else {
            budget = budget * 0.90;
            HolidayType = "Hotel";
            destination = "Europe";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", HolidayType, budget);
    }
}
