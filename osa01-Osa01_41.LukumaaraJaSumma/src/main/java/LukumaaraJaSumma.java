
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        // Tehtävä lukujen summan säilöminen
        int lukujenSumma = 0;
        int lukuja = 0;
        
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
            // sekä lisää luvun lukujen määrään
            if (luku > 0){
                lukujenSumma = lukujenSumma + luku;
                lukuja = lukuja + 1;
            }
             // Tehtävä lukujen lisääminen
            // kun käyttäjä syöttää negatiivisen luvun
            // sekä lisää luvun lukujen lukumäärään
            if (luku < 0){
                lukujenSumma = lukujenSumma + luku;
                lukuja = lukuja + 1;
            }
           
        
        }
        // Tehtävä lukujen määrän tulostaminen
        System.out.println("Lukuja yhteensä " + lukuja);
        // Tehtävä lukujen summan tulostaminen
        System.out.println("Lukujen summa " + lukujenSumma);

    }
}
