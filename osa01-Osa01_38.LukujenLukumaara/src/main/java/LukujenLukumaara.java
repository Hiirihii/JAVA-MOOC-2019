
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Tehtävä lukujen lukumäärään säilöminen
        int lukuja = 0;
        // Lukujen lukemisen toistaminen
        while (true){
            System.out.println("Syötä luku (0 lopettaa)");
            int luku = Integer.valueOf(lukija.nextLine());
           
            // Tehtävä toistolauseesta poistuminen
            // käyttäjä syöttää luvun 0
            if (luku == 0){
                break;
            }
            // Tehtävä lukujen lukumäätän lisääminen
            // kun käyttäjä syöttää negatiivisen luvun
            if (luku < 0){
                lukuja = lukuja + 1;    
            }
            // Tehtävä lukujen lukumäärän lisääminen
            // kun käyttäjä syöttää positiivisen luvun
            if (luku > 0){
                lukuja = lukuja + 1;    
            }
        
        
        }
        // Tehtävä havainnoitujen lukejen lukumäärän tulostaminen
        System.out.println("Lukuja yhteensä " + lukuja);

    }
}
