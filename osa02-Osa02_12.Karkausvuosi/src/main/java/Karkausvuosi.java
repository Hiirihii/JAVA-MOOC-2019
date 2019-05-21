
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
       System.out.println("Anna vuosi: ");
     
      
        
        int vuosiLuku = Integer.valueOf(lukija.nextLine());
        
        if (vuosiLuku % 4 == 0 && (vuosiLuku % 100 != 0 || vuosiLuku % 400 == 0)) {
            System.out.println("Vuosi on karkausvuosi.");
        } else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
          
        }

    }

