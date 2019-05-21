/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Elio implements Siirrettava {
    private int sijaintiX;
    private int sijaintiY;
    
    public Elio(int x, int y){
        this.sijaintiX = x;
        this.sijaintiY = y;
        
    }
    
    public String toString(){
        
        return "x: " + this.sijaintiX + "; " + "y: " + this.sijaintiY; 
    }
    
    public void siirra(int dx, int dy){
        this.sijaintiX = this.sijaintiX + dx;
        this.sijaintiY = this.sijaintiY + dy;
    }
}
