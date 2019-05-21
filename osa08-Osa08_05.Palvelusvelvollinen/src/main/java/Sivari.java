/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Sivari implements Palvelusvelvollinen {
    private int paivia;
    
    public Sivari(){
        this.paivia = 362;
    }
    
    public void Palvele(){
        
        if(this.paivia - 1 >= 0){
               this.paivia = this.paivia - 1;
        } else{
            this.paivia = this.paivia;
        }
     
               
    }

    @Override
    public int paiviaJaljella() {
        return this.paivia;
    }

    @Override
    public void palvele() {
        
          if(this.paivia - 1 >= 0){
               this.paivia = this.paivia - 1;
        } else{
            this.paivia = this.paivia;
        }
    }
    
}
