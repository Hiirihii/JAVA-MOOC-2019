/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Kuutio {
    private int pituus;
    private int tilavuus;
    
    public Kuutio(int sarmanPituus){
        this.pituus = sarmanPituus;
        this.tilavuus = this.pituus *  this.pituus * this.pituus;
    }
    
    public int tilavuus(){ 
        return this.tilavuus;
    
    }
    
    @Override
    public String toString(){
        return "Kuution särmän pituus on " + this.pituus + ", " + "tilavuus on " + this.tilavuus;
    }
    
}
