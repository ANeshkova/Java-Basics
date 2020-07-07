import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceSkumriqKG = Double.parseDouble(scan.nextLine());
        double priceCacaKG = Double.parseDouble(scan.nextLine());
        double PalamudKG = Double.parseDouble(scan.nextLine());
        double SafridKG = Double.parseDouble(scan.nextLine());
        int MidiKG = Integer.parseInt(scan.nextLine());

        double Palamud = PalamudKG * (priceSkumriqKG + priceSkumriqKG * 0.6);
        double Safrid = SafridKG * (priceCacaKG + priceCacaKG * 0.8);
        double Midi = MidiKG * 7.5;

        double all = Palamud + Safrid + Midi;

        System.out.printf("%.2f", all);
    }
}
