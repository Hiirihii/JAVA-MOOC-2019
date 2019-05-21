/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author ottol
 */
public class Maitosailio {

    private double tilavuus;
    private double saldo;

    public Maitosailio() {
        this.tilavuus = 2000;
        this.saldo = 0;
    }

    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
        this.saldo = 0;
    }

    public double getTilavuus() {
        return this.tilavuus;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double paljonkoTilaaJaljella() {

        return this.tilavuus - this.saldo;
    }

    public void lisaaSailioon(double maara) {

        if (maara > this.tilavuus || maara + this.saldo > this.tilavuus) {
            this.saldo = this.tilavuus;
        }  else if(maara + this.saldo < this.tilavuus){
            this.saldo = this.saldo + maara;
        } else{
            this.saldo = this.saldo + maara;
        }
    }

    public double otaSailiosta(double maara) {
        
        if (maara > this.tilavuus || maara > this.saldo) {
            this.saldo = 0;
        } else if (maara < this.saldo || maara - this.saldo >= 0) {
            this.saldo = this.saldo - maara;
        }
             return 20;
    }
    
   
    public String toString(){
        String saldo = String.valueOf(Math.ceil(this.saldo));
        String tilavuus = String.valueOf(Math.ceil(this.tilavuus));
        return saldo + "/" + tilavuus;
    }

}
