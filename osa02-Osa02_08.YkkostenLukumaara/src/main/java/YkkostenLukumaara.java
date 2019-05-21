
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä kokonaislukuja nolla lopettaa ohjelman");
        int ykkostenLukumaara = 0;
        
        while(true){
        int syote = Integer.valueOf(lukija.nextLine());
        
        if (syote == 1){
            ykkostenLukumaara = ykkostenLukumaara + 1;
        }
        if(syote == 0){
            break;
        }
        
        }
        System.out.println("Syötit yhteensä " + ykkostenLukumaara + " ykköstä");

    }
}
