
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int merkkijonoLukema = 0;
                
        System.out.println("Syötä merkkijono,'loppu' lopettaa ohjelman"); 
        
        while(true){
            String syote = lukija.nextLine();
            if (syote.equals("loppu")){
                break;
                
            } 
             merkkijonoLukema = merkkijonoLukema + 1;
        }
        System.out.println(merkkijonoLukema);
    }
}
