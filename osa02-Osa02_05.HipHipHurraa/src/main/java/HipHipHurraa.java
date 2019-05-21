
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä merkkijono ('lopeta' sulkee ohjelman)");
        while(true){
            String merkkiJono = lukija.nextLine();
            
            if (merkkiJono.equals("lopeta")){
                System.out.println("hurraa!");
                break;
                
            } else {
                System.out.println("hip!");
            }
       
        }
      
        
        
       

    }
}
