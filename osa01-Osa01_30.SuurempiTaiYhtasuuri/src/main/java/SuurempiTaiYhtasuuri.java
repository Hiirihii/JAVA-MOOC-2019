
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
      
        System.out.println("Anna ensimmäinen luku:");
        int luku1 = Integer.valueOf(lukija.nextLine()); 
        
        System.out.println("Anna ensimmäinen luku:");
        int luku2 = Integer.valueOf(lukija.nextLine()); 
        
        if (luku1 == luku2){
            System.out.println("Luvut ovat yhtä suuret!");
        } else if (luku1 > luku2){
            System.out.println("Suurempi luku: " + luku1);
        } else if (luku1 < luku2){
            System.out.println("Suurempi luku: " + luku2);
        }
        
        

    }
}
