
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TiedostonRivit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        String tiedosto = lukija.nextLine();
        lue(tiedosto);

    }

    public static List<String> lue(String tiedosto) {
        ArrayList<String> rivit = new ArrayList<>();

// luodaan lukija tiedoston lukemista varten
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        return rivit;
    }
}
