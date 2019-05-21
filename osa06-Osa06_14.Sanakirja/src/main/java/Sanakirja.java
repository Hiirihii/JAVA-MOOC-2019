
import java.util.HashMap;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ottol
 */
public class Sanakirja {

    private HashMap<String, String> kaannos;

    public Sanakirja() {
        this.kaannos = new HashMap<>();
    }

    public String kaanna(String sana) {
        if (this.kaannos.containsKey(sana)) {
            return this.kaannos.get(sana);
        }
        return null;
    }

    public void lisaa(String sana, String kaannos) {
        this.kaannos.put(sana, kaannos);

    }

    public int sanojenLukumaara() {
        return this.kaannos.size();
    }

    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> lista = new ArrayList<>();
        
        for(String key : this.kaannos.keySet()){
           
          String avain = key;
          String arvo = this.kaannos.get(key);

          lista.add(avain + " = " + arvo);
     
                
             
        }
        return lista ;
        
    }

}
