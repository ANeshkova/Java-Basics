import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scan.nextLine());
        double distanceMeter = Double.parseDouble(scan.nextLine());
        double timeSecondsFor1Meter = Double.parseDouble(scan.nextLine());

        double IvanTime = distanceMeter * timeSecondsFor1Meter;
        double delay = Math.floor(distanceMeter / 15) * 12.5;
        double time = IvanTime + delay;

        if (recordSeconds <= time) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - recordSeconds);
        }
        if (recordSeconds > time) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        }
    }
}
