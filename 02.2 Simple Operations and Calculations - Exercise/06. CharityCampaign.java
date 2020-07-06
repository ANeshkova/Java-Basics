import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int chefs = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int gofrets = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double cakesPerDay1Chef = cakes * 45;
        double gofretsPerDay1Chef = gofrets * 5.80;
        double pancakesPerDay1Chef = pancakes * 3.20;

        double allChefs = (cakesPerDay1Chef + gofretsPerDay1Chef + pancakesPerDay1Chef) * chefs;
        double allDays = allChefs * days;
        double afterExpense = allDays / 8;
        double money = allDays - afterExpense;

        System.out.printf("%.2f", money);
    }
}
