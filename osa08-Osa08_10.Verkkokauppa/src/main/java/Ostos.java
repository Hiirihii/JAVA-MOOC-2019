/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Ostos {
    
    private String nimi;
    private int kpl;
    private int yksikkohinta;
    
    public Ostos(String nimi, int kpl, int yksikkohinta){
        this.nimi = nimi;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;
    }
    
    public int hinta(){
        return this.kpl * this.yksikkohinta;
    }
    
    public void kasvataMaaraa(){
        this.kpl++;
    }
    
    public String toString(){
        return this.nimi + ": " + this.kpl;
    }
}
 
