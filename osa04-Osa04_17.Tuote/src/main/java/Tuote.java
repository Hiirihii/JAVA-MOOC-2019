/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Tuote {
    private String nimi;
    private double hinta;
    private int lukumaara;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa){
        this.nimi = nimiAlussa;
        this.hinta = hintaAlussa;
        this.lukumaara = maaraAlussa;
    }
    
    public void tulostaTuote(){
        System.out.println( this.nimi + ",hinta " + this.hinta + "," + this.lukumaara + "kpl"  );
    }
    
}
