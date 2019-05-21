
import java.util.Scanner;

public class Yhteenlasku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!"); // Tulostaa merkkijonon joka pyttää syöttämään ensimmäisen luvun.
        int luku1 = Integer.valueOf(lukija.nextLine()); // Scanner-apuväline ottaa käyttäjältä syötteen.
        
        System.out.println("Syötä toinen luku!");// Tulostaa merkkijonon joka pyttää syöttämään toisen luvun.
        int luku2 = Integer.valueOf(lukija.nextLine()); // Scanner-apuväline ottaa käyttäjältä syötteen.
        
        System.out.println(luku1 + " + " + luku2 + " = " + (luku1 + luku2)); // Tulostaa yhteenlaskulausekkeen ja syätettyjen lukujen summan.
                
        
        

    }
}
