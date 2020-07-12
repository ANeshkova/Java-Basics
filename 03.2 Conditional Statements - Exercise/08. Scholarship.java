import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double incomeLv = Double.parseDouble(scan.nextLine());
        double averageSuccess = Double.parseDouble(scan.nextLine());
        double minimumSalary = Double.parseDouble(scan.nextLine());

        double socialScholarship = 0.0;
        double excellentScholarship = 0.0;

        if (incomeLv < minimumSalary && averageSuccess >= 4.5) {
            socialScholarship = Math.floor(minimumSalary * 0.35);
        }
        if (averageSuccess >= 5.5) {
            excellentScholarship = Math.floor(averageSuccess * 25);
        }
        if (socialScholarship > excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (socialScholarship < excellentScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        } else if(socialScholarship > 0 && excellentScholarship > 0 && socialScholarship == excellentScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
