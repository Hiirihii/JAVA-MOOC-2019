
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Lukutaitovertailu {

    public static void main(String[] args) {

        ArrayList<Lukutaito> kaikki = new ArrayList<>();

        try {
            Files.lines(Paths.get("lukutaito.csv"))
                    .map(rivi -> rivi.split(","))
                    .filter(palat -> palat.length >= 4)
                    .map(palat -> new Lukutaito(palat[3], Integer.valueOf(palat[4]), palat[2], Double.valueOf(palat[5])))
                    .forEach(rivi -> kaikki.add(rivi));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());

        }

     kaikki.stream()
                .sorted()
                .forEach(h -> System.out.println(h.getMaa() + " (" + h.getVuosi() + ")," + h.getSukupuoli() + ", " + h.getLukutaitoprosentti()));
    }
 
}
 

    
 

 

       

    


