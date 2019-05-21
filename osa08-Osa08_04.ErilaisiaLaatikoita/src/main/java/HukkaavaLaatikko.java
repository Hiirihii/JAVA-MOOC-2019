
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
public class HukkaavaLaatikko extends Laatikko {
    
     private ArrayList<Tavara> lista;
    public HukkaavaLaatikko(){
         this.lista = new ArrayList<>();
    }
    
    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if (lista.contains(tavara)) {
            return false;
        }
        return false;
    }

    @Override
    public void lisaa(Tavara tavara) {
     
        if (lista.size() == 0) {
            lista.add(tavara);

        }

    }

}
    

