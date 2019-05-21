/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Laskuri {
    private int muuttuvaArvo;
    
    public Laskuri(int alkuarvo){
        this.muuttuvaArvo = alkuarvo;
    }
    public Laskuri(){
        this(0);
    }
    public void lisaa(int lisays){
        if(lisays >= 0 ){
            this.muuttuvaArvo = this.muuttuvaArvo + lisays;
        } else {
            this.muuttuvaArvo = this.muuttuvaArvo;
        }
    }
    public void vahenna(int vahennys){
        if(vahennys >= 0){
            this.muuttuvaArvo = this.muuttuvaArvo - vahennys;
        } else {
            this.muuttuvaArvo = this.muuttuvaArvo;
        }
    }
    
    public int arvo(){
        return this.muuttuvaArvo;
    }
    
    public void lisaa(){
        this.muuttuvaArvo = this.muuttuvaArvo + 1;
    }
    
    public void vahenna(){
           this.muuttuvaArvo = this.muuttuvaArvo - 1;
    }
    
}
