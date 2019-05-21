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
 
 
public class Laatikko implements Talletettava {
    private ArrayList<Talletettava> laatikko;
    private double maksimipaino;
    
    public Laatikko(double maksimipaino) {
        this.laatikko = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }
 
    public void lisaa(Talletettava talletettava) {
        
        if (talletettava.paino() < maksimipaino) {
            double summa = 0;
            for (int i = 0; i < laatikko.size(); i++) {
                summa += laatikko.get(i).paino();
            
            }
            if (summa + talletettava.paino() < maksimipaino) {
                laatikko.add(talletettava);
            }
        }
                        
    }
 
    @Override
    public double paino() {
        
        double paino = 0;
        for (int i = 0; i < laatikko.size(); i++) {
            Talletettava talletettava = laatikko.get(i);
            paino += talletettava.paino();
        }
        return paino;
    }
 
    @Override
    public String toString() {
        return "Laatikko: " + laatikko.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
        
    }
    
    
}
