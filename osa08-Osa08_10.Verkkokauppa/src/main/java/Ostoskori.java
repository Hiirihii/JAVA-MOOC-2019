

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ottol
 */
import java.util.HashMap;
import java.util.Map;
 

 
public class Ostoskori {
    private Map<String, Ostos> ostokset;
    
    public Ostoskori(){
        this.ostokset = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta){
        
        if (!(this.ostokset.keySet().contains(tuote))){
            Ostos ostos = new Ostos(tuote, 1, hinta);
            this.ostokset.put(tuote, ostos);
        }else{
            Ostos ostos = this.ostokset.get(tuote);
            ostos.kasvataMaaraa();
            this.ostokset.put(tuote, ostos);
        }
    }
    
    
    public int hinta(){
        int hinta = 0;
        
        for (Ostos ostos: this.ostokset.values()){
           hinta += ostos.hinta();
        }
        
        return hinta;
    }
    
    public void tulosta(){
        for (Ostos ostos: this.ostokset.values()){
            System.out.println(ostos.toString());
        }
        
    }
}
 