
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    // toteuta tänne tarvittavat metodit

    public void lisaaAteria(String ateria) {
        if(ateriat.contains(ateria)){
        
        } else{
             this.ateriat.add(ateria);
        }
    }

    public void tyhjennaRuokalista() {
        ateriat.clear();
        
    }

    public void tulostaAteriat() {
        for (String ateria: this.ateriat) {
            System.out.println(ateria);
        }
    }
}
