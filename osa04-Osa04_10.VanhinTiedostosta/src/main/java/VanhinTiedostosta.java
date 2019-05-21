
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        int vanhinIka = 0;
        String vanhin = "";
        
        try (Scanner luettu = new Scanner(new File(tiedosto))){
                while (luettu.hasNextLine()) {
                String rivi = luettu.nextLine();

                 String[] palat = rivi.split(",");
                 String nimi = palat[0];
                 int ika = Integer.valueOf(palat[1]);

                 if (vanhin.equals("") || vanhinIka < ika) {
                   vanhin = nimi;
                   vanhinIka = ika;
                 }
                }
        
        }catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        System.out.println("Vanhin Oli: " + vanhin);

    }
}
