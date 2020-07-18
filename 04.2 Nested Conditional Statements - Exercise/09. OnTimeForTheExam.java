import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startHour = Integer.parseInt(scan.nextLine());
        int startMinutes = Integer.parseInt(scan.nextLine());
        int comingHour = Integer.parseInt(scan.nextLine());
        int comingMinutes = Integer.parseInt(scan.nextLine());

        int start = startHour * 60 + startMinutes;
        int come = comingHour * 60 + comingMinutes;
        int time = 0;
        int hours = 0;
        int minutes = 0;

        if (start == come) {
            System.out.println("On time");
        } else if (come > start) {
            time = come - start;
            hours = time / 60;
            minutes = time % 60;

            System.out.println("Late");

            if (hours == 0) {
                System.out.println(minutes + " minutes after the start");

            } else {
                if (minutes < 10) {
                    System.out.println(hours + ":0" + minutes + " hours after the start");
                } else {
                    System.out.println(hours + ":" + minutes + " hours after the start");
                }
            }
        } else {
            time = start - come;
            hours = time / 60;
            minutes = time % 60;

            if (time <= 30) {
                System.out.println("On time");

            } else {
                System.out.println("Early");

            }

            if (hours == 0) {
                System.out.println(minutes + " minutes before the start");

            } else {
                if (minutes < 10) {
                    System.out.println(hours + ":0" + minutes + " hours before the start");
                } else {
                    System.out.println(hours + ":" + minutes + " hours before the start");
                }
            }
        }
    }
}
