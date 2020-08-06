import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filmsCount = Integer.parseInt(scan.nextLine());
        String films = "";
        double sum = 0;
        double average = 0;

        String highestRating = "";
        String lowestRating = "";

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < filmsCount ; i++) {
            films = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());

            if (rating > max) {
                max = rating;
                highestRating = films;

            } else if (rating < min) {
                min = rating;
                lowestRating = films;

            }

            sum += rating;
            average = sum / filmsCount;
        }

        System.out.printf("%s is with highest rating: %.1f%n", highestRating, max);
        System.out.printf("%s is with lowest rating: %.1f%n", lowestRating, min);
        System.out.printf("Average rating: %.1f", average);
    }
}
