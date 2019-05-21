
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.println("Anna nimi:");
        String syote = lukija.nextLine();
        laskeKirjaimet(syote);
        
        
    }
    
    // tee tänne metodi 
    public static int laskeKirjaimet(String merkkijono){
        System.out.println("Kirjainmäärä: " + merkkijono.length());
        return merkkijono.length();
    }
            
    
}
