
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int luku1 = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int luku2 = Integer.valueOf(lukija.nextLine());
        
        System.out.println(luku1 + " + " + luku2 +  " = " + (luku1 + luku2));
        System.out.println(luku1 + " - " + luku2 +  " = " + (luku1 - luku2));
        System.out.println(luku1 + " * " + luku2 +  " = " + (luku1 * luku2));
        System.out.println(luku1 + " / " + luku2 +  " = " + (1.0 * luku1 / luku2));
        
            
         

    }
}
