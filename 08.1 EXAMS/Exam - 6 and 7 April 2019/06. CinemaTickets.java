import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = 0;
        int standard = 0;
        int kids = 0;

        String filmName = scan.nextLine();

        while (!filmName.equals("Finish")) {
            int places = Integer.parseInt(scan.nextLine());
            int people = 0;

            for (int i = 0; i < places; i++) {
                String command = scan.nextLine();

                if (command.equals("student")) {
                    students++;

                } else if (command.equals("standard")) {
                    standard++;

                } else if (command.equals("kid")) {
                    kids++;

                } else if (command.equals("End")) {
                    break;
                }

                people++;
            }

            System.out.println(String.format("%s - %.2f%% full.", filmName, people * 1.0 / places * 100));
            filmName = scan.nextLine();
        }

        int totalTickets = standard + students + kids;

        System.out.println(String.format("Total tickets: %d", totalTickets));
        System.out.println(String.format("%.2f%% student tickets.", (students * 1.0 / totalTickets * 100)));
        System.out.println(String.format("%.2f%% standard tickets.", (standard * 1.0 / totalTickets * 100)));
        System.out.println(String.format("%.2f%% kids tickets.", (kids * 1.0 / totalTickets * 100)));
    }
}