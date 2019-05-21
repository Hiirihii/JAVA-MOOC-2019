
import java.util.Scanner;

public class Alkuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna sana:");
        String syote = lukija.nextLine();
        
        System.out.println("Alkuosanpituus pituus:");
        int pituus = Integer.valueOf(lukija.nextLine());
        
        String alkuosa = syote.substring(0, pituus);
        System.out.println("Tulos: " + alkuosa );
        
    }
}
