/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
import java.util.ArrayList;

public class Muutoshistoria {

    private ArrayList<Double> historia;

    public Muutoshistoria() {
        this.historia = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        this.historia.add(tilanne);
    }

    public void nollaa() {

        this.historia = new ArrayList<>();

    }

    public double maxArvo() {
                double suurin = this.historia.get(0);
        for (Double minArvo : this.historia) {
            if (minArvo >= suurin) {
                 suurin = minArvo ;
            } else if(minArvo < suurin) {
                suurin = suurin;
                
            }
          
        }
        return suurin;
    }

    public double minArvo() {
        double pienin = this.historia.get(0);
        for (Double minArvo : this.historia) {
            if (minArvo <= pienin) {
                 pienin = minArvo ;
            } else if(minArvo > pienin) {
                pienin = pienin;
                
            }
          
        }
        return pienin;
    }

    public double keskiarvo() {
        double keskiarvo = 0;
        double summa = 0;
        for (Double luku : historia) {
            summa = summa + luku;
            keskiarvo = 1.0 * summa / historia.size();
        }
        return keskiarvo;

    }
    @Override
    public String toString() {
        
        return historia.toString();
    
    }

}
