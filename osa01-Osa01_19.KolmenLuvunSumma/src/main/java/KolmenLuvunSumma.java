
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!"); // Pyttää käyttäjältä ensimmäistä lukua.
        int luku1 = Integer.valueOf(lukija.nextLine()); // Scanner-apuväline ottaa käyttäjän syötteen.
        
        System.out.println("Syötä toinen luku!"); // Pyytää käyttäjältä toista lukua.
        int luku2 = Integer.valueOf(lukija.nextLine()); // Scaner-apuväline ottaa käyttäjän syötteen
        
        System.out.println("Syötä kolmas luku!"); // Pyytää käyttäjältä kolmatta lukua.
        int luku3 = Integer.valueOf(lukija.nextLine()); // Scaner-apuväline ottaa käyttäjän syötteen
        
        System.out.println("Lukujen summa on " + (luku1 + luku2 + luku3)); // Tulostaa käyttäjän antamien arvojen summan.

    }
}
