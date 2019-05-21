/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Opiskelija extends Henkilo {
    private int opintopisteet;
    
    public Opiskelija(String nimi, String osoite){
        super(nimi, osoite);
        
    }
    public void opiskele(){
        this.opintopisteet = this.opintopisteet + 1;
    }
    
    public int opintopisteita(){
        return this.opintopisteet;
    }
    
    @Override
     public String toString(){
         String pisteet = Integer.toString(this.opintopisteet);
        return super.toString() + "\n  opintopisteitä " + pisteet; 
    }
}
