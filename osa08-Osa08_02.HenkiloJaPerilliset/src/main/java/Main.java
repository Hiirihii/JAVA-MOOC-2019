
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // tee tänne testikoodia
        //Opiskelija op = new Opiskelija("Olli", "Ida Albergintie 1");
        Opettaja po = new Opettaja("Joel Kaasinen", "Haagantie 123", 980);
        //System.out.print(op);
        System.out.print(po);
    }

    public static void tulostaHenkilot(ArrayList<Henkilo> henkilot) {

        for (Henkilo tiedot : henkilot) {
            System.out.print(tiedot);
        }
    }

}
