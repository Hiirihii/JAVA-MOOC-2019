/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
package sovellus;
import java.util.ArrayList;
import java.util.List;
 
public class Keskiarvosensori implements Sensori {
    private ArrayList<Sensori> sensorit;
    private ArrayList<Integer> mitatut;
    
    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mitatut = new ArrayList<>();
    }
    
    @Override
    public boolean onPaalla() {
        int tarvittavaLuku = 0;
        for (Sensori sensori: sensorit) {
            if (sensori.onPaalla()) {
                tarvittavaLuku++;
            }
        }
        
        if (tarvittavaLuku==sensorit.size()) {
            return true;
        }
        return false;
    }
    
    @Override
    public void paalle() {
        for (Sensori sensori: sensorit) {
            sensori.paalle();
        }
    }
    
    @Override
    public void poisPaalta() {
        for (Sensori sensori: sensorit) {
            sensori.poisPaalta();
        }
    }
    
    @Override
    public int mittaa() {
        if ((!(this.onPaalla()))||this.sensorit.isEmpty()) {
            throw new IllegalStateException();
        }
        
        int summa = 0;
        int keskiarvo = 0;
        for (Sensori sensori: sensorit) {
            summa+=sensori.mittaa();
            keskiarvo = summa/sensorit.size();
           
           
        }
        mitatut.add(keskiarvo);
        return keskiarvo;
    }
    
    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
    }
    
    public List<Integer> mittaukset() {
        return mitatut;
    }
}
