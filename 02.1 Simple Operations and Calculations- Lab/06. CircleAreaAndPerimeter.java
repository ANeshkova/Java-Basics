import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double area = 3.14159265358979323846 * r * r;
        double parameter = 2 * 3.14159265358979323846 * r;

        System.out.printf("%.2f" , area);
        System.out.println();
        System.out.printf("%.2f", parameter);
    }
}
