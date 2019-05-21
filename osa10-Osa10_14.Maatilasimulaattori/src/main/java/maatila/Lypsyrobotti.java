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
public class Lypsyrobotti {
    private Maitosailio maitosailio;
    
    public Lypsyrobotti(){
        
    }
    public Maitosailio getMaitosailio(){
        if (this.maitosailio != null) {
            return this.maitosailio;
        } else {
            return null;
        }
    }
    public void setMaitosailio(Maitosailio maitosailio){
        this.maitosailio = maitosailio;
    }
    public void lypsa(Lypsava lypsava){
        if (this.maitosailio != null) {
            this.maitosailio.lisaaSailioon(lypsava.lypsa());
        } else {
            System.out.println("Maidot menevät hukkaan!");;
        }
    }
}
