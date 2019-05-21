/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Opettaja extends Henkilo {
    private int palkka;
    
    
    public Opettaja(String nimi, String osoite, int palkka){
        
        super(nimi, osoite);
        this.palkka = palkka;
    }
    
     @Override
     public String toString(){
         String palkka = Integer.toString(this.palkka);
         return super.toString() + "\n  palkka " + palkka +  " euroa"; 
    }
}
