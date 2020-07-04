import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int animals = Integer.parseInt(scan.nextLine());

        double dogfood = dogs * 2.5;
        double animalfood = animals * 4;
        double lv = dogfood + animalfood;

        System.out.printf("%.2f lv.", lv);
    }
}
