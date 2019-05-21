
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int vuorokaudet = Integer.valueOf(lukija.nextLine()); // ottaa käyttäjän syötteen kokonaislukuna.
        
        int sekunnit = (24 * 60 * 60) * vuorokaudet; // Kertoo vuorokauden sekunti määrän käyttäjän syöttämällä päivien lukumäärällä.
        
        System.out.println(sekunnit); // Tulostaa muuttujan sekunnit arvon.

    }
}
