
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ottol
 */
public class Kellari {

    private HashMap<String, ArrayList<String>> komerot;

    public Kellari() {

        this.komerot = new HashMap<>();

    }

    public void lisaa(String komero, String tavara) {

        this.komerot.putIfAbsent(komero, new ArrayList<>());
        this.komerot.get(komero).add(tavara);

    }

    public ArrayList<String> sisalto(String komero) {

        if (this.komerot.get(komero) == null) {
            this.komerot.putIfAbsent(komero, new ArrayList<>());
            return this.komerot.get(komero);
        } else {

            return this.komerot.get(komero);
        }

    }

    public void poista(String komero, String tavara) {
        
            
          this.komerot.get(komero).remove(tavara);
          
          if(this.komerot.get(komero).size() == 0){
           this.komerot.remove(komero);
          
          }
          
      

    }

    public ArrayList<String> komerot() {
        ArrayList<String> komerot = new ArrayList<String>();
        
        for(String key:  this.komerot.keySet()){
            
             if (this.komerot.isEmpty()) {
                continue;
               
             } else {
                komerot.add(key);
            
             }
             
        }
         return komerot;
         
    }

}
