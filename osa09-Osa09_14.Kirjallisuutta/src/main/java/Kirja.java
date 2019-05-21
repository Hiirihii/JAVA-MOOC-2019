/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Kirja {
    private String nimi;
    private int ika;
    
    public Kirja (String nimi, int ika){
        this.nimi = nimi;
        this.ika = ika;
    }
    public String getNimi(){
        return this.nimi;
    }
    public int getIka(){
        return this.ika;
    }
    @Override
    public String toString (){
        return this.nimi + "(" + this.ika + " vuotiaille ja vanhemmille)";
    }
}
