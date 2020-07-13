import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dayOf = Integer.parseInt(scan.nextLine());

        int dayOn = 365 - dayOf;
        int timeForPlay = dayOn * 63 + dayOf * 127;
        int min = 0;
        int hours = 0;

        if (timeForPlay > 30000) {
            min = timeForPlay - 30000;
            hours = min / 60;
            min = min % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, min);
        } else {
            min = 30000 - timeForPlay;
            hours = min / 60;
            min = min % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, min);
        }
    }
}
