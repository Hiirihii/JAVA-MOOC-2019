/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Harjoitusapuri {
    private int ika;
    private int lepoSyke;
  
    
    public Harjoitusapuri(int ika, int leposyke){
        this.ika = ika;
        this.lepoSyke = leposyke;

    
    }
    public double tavoitesyke(double prosenttiaMaksimista){
        double tavoiteSyke = ( 206.3 - (0.711 * this.ika) - this.lepoSyke) * (prosenttiaMaksimista) + this.lepoSyke;
        return tavoiteSyke;
    
    }
}
