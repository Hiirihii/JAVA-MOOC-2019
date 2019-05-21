
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        Random arvottu = new Random();
        int lukuja = 0;

        while (lukuja < 7) {
            // Arvotaan ja tulostetaan satunnainen luku
            int luku = arvottu.nextInt(41);
            
            if (sisaltaaNumeron(luku) == true || luku == 0) {
                continue;
                
            } else if(sisaltaaNumeron(luku) == false) {
                 lukuja++;
                 numerot.add(luku);
               
            }

        }
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        if(this.numerot.contains(numero)){
            return true;
        }
        
        return false;
    }
}
