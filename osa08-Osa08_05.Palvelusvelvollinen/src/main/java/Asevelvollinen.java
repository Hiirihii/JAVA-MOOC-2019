/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Asevelvollinen implements Palvelusvelvollinen {

    private int paivia;

    public Asevelvollinen(int paivia) {
        this.paivia = paivia;
    }

    public int paiviaJaljella() {
        return this.paivia;
    }

    @Override
    public void palvele() {
        
        if (this.paivia - 1 >= 0) {
            this.paivia = this.paivia - 1;
        } else {
            this.paivia = this.paivia;
        }
    }
}
