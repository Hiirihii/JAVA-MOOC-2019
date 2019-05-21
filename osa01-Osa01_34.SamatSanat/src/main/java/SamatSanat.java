
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        // Ohjelma ottaa käyttäjältä syötteen.
        System.out.println("Syötä ensimmäinen merkkijono:");
        String syote1 = String.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen merkkijono:");
        String syote2 = String.valueOf(lukija.nextLine());
        
        // Ohjelma vertaa ovatko syötteen merkkijonot samat.
        if (syote1.equals(syote2)){
            System.out.println("Samat sanat");
        } else {
            System.out.println("Ei sitten");
        }
    }
}
