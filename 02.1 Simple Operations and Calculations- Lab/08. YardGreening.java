import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m2 = Double.parseDouble(scan.nextLine());

        double all = m2 * 7.61;
        double discount = 0.18 * all;
        double money = all - discount;

        System.out.printf("The final price is: %.2f lv.", money);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
