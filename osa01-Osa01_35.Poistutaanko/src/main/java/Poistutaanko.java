
import java.util.Scanner;

public class Poistutaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toistolause kysyy käyttäjätä syötettä
        // jos syöte on "kyllä" ohjelma lopettaa kysymisen
        while (true) {
            System.out.println("Poistutaanko?");
            String syote = lukija.nextLine();
            if (syote.equals("kyllä")){
                break;
            
            }
        
        }
        
        System.out.println("Valmista!");

    }
}
