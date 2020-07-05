import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int table = Integer.parseInt(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        double big = table * ( lenght + 2 * 0.30 ) * ( width + 2 * 0.30 );
        double small = table * ( lenght / 2 ) * ( lenght / 2);

        double USD = big * 7 + small * 9;
        double BGN = USD * 1.85;

        System.out.printf("%.2f USD", USD);
        System.out.println();
        System.out.printf("%.2f BGN", BGN);
    }
}
