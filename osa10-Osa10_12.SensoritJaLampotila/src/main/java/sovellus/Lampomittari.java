/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.Random;

/**
 *
 * @author ottol
 */
public class Lampomittari implements Sensori {
    private boolean paalla = false;
    private int randomi;
    
      @Override
    public boolean onPaalla() {
        return paalla;
    }

    @Override
    public int mittaa() {
         if (paalla == false) {
            throw new IllegalArgumentException("Arvosanan tulee olla välillä 0-5");
        } else {
             randomi = new Random().nextInt(61) - 30;
         }
        
        return randomi;
    }
    @Override
    public void paalle() {
         paalla = true;
    }

    @Override
    public void poisPaalta() {
        paalla = false;
    }
    
}
