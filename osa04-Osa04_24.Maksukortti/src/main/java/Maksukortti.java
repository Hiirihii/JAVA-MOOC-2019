/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Maksukortti {
    private double saldo;
    
    public Maksukortti(double alkuSaldo){
        this.saldo = alkuSaldo;
 
    }
    
    public String toString(){
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }
    public void syoEdullisesti(){
        
        if(this.saldo >= 2.60){
            this.saldo = this.saldo - 2.60;
        }
    }
    
    public void syoMaukkaasti(){
        if(this.saldo >= 4.60){
           this.saldo = this.saldo - 4.60;
        }   
    }
    
    public void lataaRahaa(double rahaMaara){
       if(rahaMaara <= 0){
           this.saldo = this.saldo;
           
       } else if((this.saldo + rahaMaara) <= 150 ){
            this.saldo = this.saldo + rahaMaara;
       } else {
           this.saldo = 150;
       }
       
    }
    
    
    
}
