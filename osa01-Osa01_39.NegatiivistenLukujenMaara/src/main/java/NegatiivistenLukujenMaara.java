
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Tehtävä negatiivisten lukujen säilöminen
        int negatiivisiaLukuja = 0;
        
        // Lukujen lukemisen toistaminen
        while (true){
            System.out.println("Syötä luku (0 lopettaa)");
            int luku = Integer.valueOf(lukija.nextLine());
           
            // Tehtävä toistolauseesta poistuminen
            // kun käyttäjä syöttää luvun 0
            if (luku == 0){
                break;
            }
            // Tehtävä lukujen lukumäätän lisääminen
            // kun käyttäjä syöttää negatiivisen luvun
            if (luku < 0){
                negatiivisiaLukuja = negatiivisiaLukuja + 1;    
            }
        
        
        }
        // Tehtävä havainnoitujen lukejen lukumäärän tulostaminen
        System.out.println("Negatiivisia lukuja yhteensä " + negatiivisiaLukuja);

    }
}
