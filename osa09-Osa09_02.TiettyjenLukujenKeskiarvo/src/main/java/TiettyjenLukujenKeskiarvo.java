
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> syotteet = new ArrayList<>(); // luetaan syotteet

        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }

            syotteet.add(rivi);
        }
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String syote = lukija.nextLine();
        
        double keskiarvo = 0;
        if (syote.equals("n")) {
            // selvitetään keskiarvo
            keskiarvo = syotteet.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku < 0)
                    .average()
                    .getAsDouble();
        }
        if (syote.equals("p")) {
            // selvitetään keskiarvo
             keskiarvo = syotteet.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku > 0)
                    .average()
                    .getAsDouble();
        }

// tulostetaan tilastot
        //System.out.println("Kolmella jaollisia: " + kolmellaJaollistenLukumaara);
        System.out.println("Lukujen keskiarvo: " + keskiarvo);

    }
}
