
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ottol
 */
public class Varasto {
    
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;
    
    public Varasto(){
        
        this.hinnat = new HashMap<>();
        this.saldot = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo){
        this.hinnat.put(tuote, hinta);
        this.saldot.put(tuote, saldo);
    }
    
    public int hinta(String tuote){
        
        if (this.hinnat.containsKey(tuote)){
            return this.hinnat.get(tuote);
        }
        
        return -99;        
    }
    
    public int saldo(String tuote){
        
        if (this.saldot.containsKey(tuote)){
            return this.saldot.get(tuote);
        }
        
        return 0;
    }
    
    public boolean ota(String tuote){
        
        if (!(this.saldot.containsKey(tuote))){
            return false;
        }
        
        saldot.put(tuote, saldot.get(tuote) - 1);
        
        if (saldot.get(tuote) < 0) {
            saldot.put(tuote, 0);
            return false;
        }
        return true;
    }
    
    public Set<String> tuotteet(){
        return hinnat.keySet();
    }
}
