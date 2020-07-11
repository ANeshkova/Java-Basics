import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int hoursMin = hours * 60;
        int allMinutes = hoursMin + minutes + 15;
        int allHours = allMinutes / 60;
        int allMin = allMinutes % 60;

        if (allHours > 23) {
            allHours = 0;
        }
        if (allMin < 10) {
            System.out.printf("%d:0%d", allHours, allMin);
        } else {
            System.out.printf("%d:%d", allHours, allMin);
        }
    }
}
