import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());

        double daysTraining = days * 0.1;
        double daysForWork = days - daysTraining;
        double hoursForWork = Math.floor((daysForWork * 8) + (days * people * 2));

        if (hours > hoursForWork) {
            System.out.printf("Not enough time!%.0f hours needed.", hours - hoursForWork);
        } else {
            System.out.printf("Yes!%.0f hours left.", hoursForWork - hours);
        }
    }
}
