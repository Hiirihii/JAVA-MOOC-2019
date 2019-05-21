
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.\n" +
        "Minkä niminen tarinassa esiintyvä hahmo on?");
        
        String eka = lukija.nextLine();
        
        System.out.println("Mikä hahmon ammatti on?");
        String toka = lukija.nextLine();

        
        System.out.println("Tässä tarina:\n" +
        "Olipa kerran " + eka + "," + " joka oli ammatiltaan " + toka + ".\n" +
        "Matkatessaan töihin, " + eka + " mietti arkeaan. Kun työnä\n" +
        "on " + toka + "," + " tekemistä riittää välillä hyvin paljon ja\n" +
        "välillä ei lainkaan. Ehkäpä " + eka + " ei olekaan koko\n" +
        "elämäänsä " + toka + ".");
                
    }
}
