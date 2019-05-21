
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lukumaara = 0;
        int ykkostenLukumaara = 0;
        double osuus = 0;
        
        while(lukija.hasNextLine()){
        
            int syote = Integer.valueOf(lukija.nextLine());

            if(syote == 0){
                if(lukumaara == 0){
                    System.out.println("ykkösten osuutta ei voida laskea");
                } else{
                    break;
                }
            }    
            if(syote == 1){
                ykkostenLukumaara = ykkostenLukumaara +1;
            }
            if(syote < 0){
                lukumaara = lukumaara + 1;
            }
            if(syote > 0){
                lukumaara = lukumaara + 1;
            }
            osuus = 1.0 * ykkostenLukumaara / lukumaara;
        }        
        System.out.println("Syötettyjen ykkosten osuus on " + osuus);
    }
}
