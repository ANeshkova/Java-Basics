import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int V = Integer.parseInt(scan.nextLine());        // Обем на басейна в литри –[1…10000].
        int P1 = Integer.parseInt(scan.nextLine());  //литрите вода минаващи през първата тръба за един час –[1…5000].
        int P2 = Integer.parseInt(scan.nextLine());       //дебит на втората тръба за час– [1…5000].
        double H = Double.parseDouble(scan.nextLine());   //часовете които работникът отсъства –[1.0…24.00]
        double P1H = P1 * H;  //литри за вс часове от 1 тръба
        double P2H = P2 * H;  //литри за вс часове от 2 тръба
        double liters = P1H + P2H;
        double litersAll = liters / V * 100;
        double liters1 = P1H / liters * 100;
        double liters2 = P2H / liters * 100;

        if (V >= liters) {
            System.out.printf("The pool is %.2f full. Pipe 1: %.2f. Pipe 2: %.2f.",
                    litersAll, liters1, liters2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, liters - V);
        }
    }
}
