
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> nimet = new ArrayList<>();
        
          int vuosienSumma = 0;
          int vuosienLukumaara = 0;
          String pisin = "";

          while (true) {
              String luettu = lukija.nextLine();
              if (luettu.equals("")) {
                  break;
              }

              String[] palat = luettu.split(",");
              vuosienSumma = vuosienSumma + Integer.valueOf(palat[1]);
              vuosienLukumaara = vuosienLukumaara + 1;
              
                String[] toisetPalat = luettu.split(",");
                nimet.add(toisetPalat[0]);
            }

            for (String nimi: nimet) {
                
                if(pisin.length() < nimi.length()){
                    pisin = nimi;
                }
            }
            
            if (vuosienLukumaara > 0) {
              System.out.println("Pisin nimi: " + pisin);
              System.out.println("Syntymävuosien keskiarvo: " + (1.0 * vuosienSumma / vuosienLukumaara));
            } else {
                System.out.println("Ei syötteitä.");
              }
            
            
          }
          

          


}
