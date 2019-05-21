/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class StringUtils {
    
    public static boolean sisaltaa(String sana, String haettava){
        String mistaHaetaan = sana.trim();
        String mitaHaetaan = haettava.trim();
        boolean vastaus = false;
        
        if(mistaHaetaan.toUpperCase().contains(mitaHaetaan.toUpperCase())){
            vastaus = true;
        } else if (mistaHaetaan == null || mitaHaetaan == null){
            vastaus = false;
        }
        return vastaus;
        
    }
    
}
