
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
    
        System.out.println("Syötä kokonaisluku: ");

        int luku = Integer.valueOf(lukija.nextLine());  
        
        int toinenPotenssi = luku * luku;
        
        System.out.println(toinenPotenssi);
                
           

    }
}
