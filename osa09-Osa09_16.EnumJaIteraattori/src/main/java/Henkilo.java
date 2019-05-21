/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Henkilo {
    private Koulutus koulutus;
    private String nimi;
    
    public Henkilo(String nimi, Koulutus koulutus){
        this.nimi = nimi;
        this.koulutus = koulutus;
       
    }
    
    public Koulutus getKoulutus(){
        return koulutus;
    }
    
    public String toString(){
        return nimi + ", " + koulutus;
    }
    
}
