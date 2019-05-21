/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Kirjat {
    
    
    private String nimi;
    private int sivuja;
    private int kirjoitusvuosi;

    public Kirjat(String nimi, int sivuja, int kirjoitusvuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.kirjoitusvuosi = kirjoitusvuosi;
    }

    public boolean onHuippu() {
        return this.nimi.contains("MasterChef");
    }

    public String getNimi() {
        return nimi;
    }

    public int getSivuja() {
        return sivuja;
    }
    
     public int getkirjoitusvuosi() {
        return kirjoitusvuosi;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.sivuja + " sivua, " + this.kirjoitusvuosi;
    }
}

