
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Tehtävä lukujen summan säilöminen
        int lukujenSumma = 0;
        
        // Tehtävä lukujen lukemisen toistaminen
        while (true){
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            // Tehtävä toistolauseen lopettaminen
            if (luku == 0){
                break;
            }
            // Tehtävä lukujen lisääminen
            // kun käyttäjä syöttää positiivisen luvun
            if (luku > 0){
                lukujenSumma = lukujenSumma + luku;
            }
             // Tehtävä lukujen lisääminen
            // kun käyttäjä syöttää negatiivisen luvun
            if (luku < 0){
                lukujenSumma = lukujenSumma + luku;
            }
           
        
        }
        // Tehtävä lukujen summan tulostaminen
        System.out.println("Lukujen summa " + lukujenSumma);

    }
}
