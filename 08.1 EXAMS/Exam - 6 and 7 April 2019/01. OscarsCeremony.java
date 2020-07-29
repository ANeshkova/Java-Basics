import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());

        double statuetki = rent * 0.70;
        double ketering = statuetki * 0.85;
        double sound = ketering / 2;

        double all = rent + statuetki + ketering + sound;

        System.out.printf("%.2f", all);
    }
}
