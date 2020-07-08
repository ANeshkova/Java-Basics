import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Celsius = Double.parseDouble(scan.nextLine());

        if (Celsius >= 26 && Celsius <= 35) {
            System.out.println("Hot");
        } else if (Celsius >= 20.1 && Celsius <= 25.9) {
            System.out.println("Warm");
        } else if (Celsius >= 15 && Celsius <= 20){
            System.out.println("Mild");
        } else if (Celsius >= 12 && Celsius <= 14.9){
            System.out.println("Cool");
        } else if (Celsius >= 5 && Celsius <= 11.9){
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}


