
import java.util.Scanner;

public class KahdenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!"); // Tulostaa pyynnön syöttää ensimmäisen luvun.
        int luku1 = Integer.valueOf(lukija.nextLine()); // Antaa muuttajalle luku1 käyttäjän syöttämän arvon.
        
        System.out.println("Syötä toinen luku!"); // Tulostaa pyynnön syöttää toisen luvun.
        int luku2 = Integer.valueOf(lukija.nextLine()); // Antaa muuttajalle luku2 käyttäjän syöttämän arvon.
        
        System.out.println("Syötettyjen lukujen keskiarvo on " + (1.0*luku1 + luku2) / 2); // Suorittaa muuttujien yhteenlaskun ja jakaa summan muuttujien lukumäärällä ja tulostaa keskiarvon.
        

    }
}
