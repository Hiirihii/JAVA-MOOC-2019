
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä ensimmäinen kokonaisluku: ");  
        int luku1 = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen kokonaisluku: ");
        int luku2 = Integer.valueOf(lukija.nextLine());
        
        int lukujenSumma = luku1 + luku2;
        double nelioJuuri = Math.sqrt(lukujenSumma);
        
        System.out.println("Luvun " + lukujenSumma + " neliöjuuri on " + nelioJuuri);

    }
}
