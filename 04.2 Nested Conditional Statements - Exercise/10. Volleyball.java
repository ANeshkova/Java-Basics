import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yearType = scan.nextLine();
        double holidays = Double.parseDouble(scan.nextLine());
        int weekends = Integer.parseInt(scan.nextLine());
        double weekendGames = (48 - weekends) * 0.75;
        double holidayGames = holidays * 2 / 3;
        double allgames = weekends + holidayGames + weekendGames;

        if (yearType.equals("leap")) {
            allgames = allgames + allgames * 0.15;
        }

        allgames = Math.floor(allgames);
        System.out.printf("%.0f", allgames);
    }
}
