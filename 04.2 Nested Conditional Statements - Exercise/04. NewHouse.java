import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        switch (flower) {
            case "Roses":
                price = 5 * count;
                if (count > 80) {
                    price *= 0.9;
                }
                break;
            case "Dahlias":
                price = 3.80 * count;
                if (count > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.80 * count;
                if (count > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = 3 * count;
                if (count < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50 * count;
                if (count < 80) {
                    price *= 1.20;
                }
        }
        double leftSum = Math.abs(budget - price);
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, leftSum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", leftSum);
        }
    }
}
