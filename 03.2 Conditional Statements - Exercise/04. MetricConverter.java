import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        String in = scan.nextLine();
        String out = scan.nextLine();

        if (in.equals("m") && out.equals("cm")) {
            double number = num * 100;
            System.out.printf("%.3f", number);
        } else if (in.equals("cm") && out.equals("m")) {
            double number = num / 100;
            System.out.printf("%.3f", number);
        } else if (in.equals("m") && out.equals("mm")) {
            double number = num * 1000;
            System.out.printf("%.3f", number);
        } else if (in.equals("mm") && out.equals("m")) {
            double number = num / 1000;
            System.out.printf("%.3f", number);
        } else if (in.equals("cm") && out.equals("mm")) {
            double number = num * 10;
            System.out.printf("%.3f", number);
        } else {
            double number = num / 10;
            System.out.printf("%.3f", number);
        }
    }
}
