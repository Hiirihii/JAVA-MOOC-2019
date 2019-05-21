
import java.util.ArrayList;
import java.util.Scanner;

public class LukujenKeskiarvo {

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

// selvitetään keskiarvo
        double keskiarvo = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

// tulostetaan tilastot
        //System.out.println("Kolmella jaollisia: " + kolmellaJaollistenLukumaara);
        System.out.println("Lukujen keskiarvo: " + keskiarvo);

    }
}
