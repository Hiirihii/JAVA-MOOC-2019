/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.Random;

/**
 *
 * @author ottol
 */
public class Lehma implements Lypsava, Eleleva {

    private String nimi;
    private double utareidenTilavuus;
    private double maidonMaara;
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Lehma() {
        this.nimi = "Elukka";
        this.utareidenTilavuus = 15 + new Random().nextInt(26);
        Random r = new Random();
        int low = 0;
        int high = 30;
        int result = r.nextInt(high - low) + low;
        this.nimi = NIMIA[result];

    }

    public Lehma(String nimi) {
        this.nimi = nimi;
        this.utareidenTilavuus = 15 + new Random().nextInt(26);
    }

    public String getNimi() {
        return this.nimi;
    }

    public double getTilavuus() {

        return this.utareidenTilavuus;
    }

    public double getMaara() {
        
        return this.maidonMaara;

    }

    @Override
    public void eleleTunti() {
        Random r = new Random();
        double value = 0.7 + (2.0 - 0.7) * r.nextDouble();;
        if(this.maidonMaara + value < this.utareidenTilavuus){
        this.maidonMaara = this.maidonMaara + value;
        } else {
            this.maidonMaara = this.utareidenTilavuus;
        }
                
    }

    @Override
    public double lypsa() {
        double lypsetty = this.maidonMaara;
        this.maidonMaara = 0;
 
        return lypsetty;
    }

    public String toString() {

        return this.nimi + " " + Math.ceil(this.maidonMaara) + "/" + this.utareidenTilavuus;

    }

}
